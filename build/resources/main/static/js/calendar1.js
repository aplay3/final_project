document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
        initialView: 'dayGridMonth',
        events: '/json/events.json', // JSON 파일의 경로를 지정합니다.
        locale: 'ko', // 한국어 locale 사용
        eventTimeFormat: { // 이벤트 시간 형식 설정
            hour: 'numeric',
            minute: '2-digit',
            hour12: false ,// AM/PM 형식으로 시간 표시 
        },
        dayMaxEventRows: true, // 하루에 최대 표시할 일정 행 수
        views: {
            dayGrid: {
                dayMaxEventRows: 2 // 월별 캘린더에서도 일정 행 수 제한
            }
        }
    });
    calendar.render();
});