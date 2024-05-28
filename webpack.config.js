module.exports = {
    entry: './src/resources/templates/index.html',
    output: {
        module : 'development' ,
        filename: 'bundle.js',
        path: path.resolve(__dirname, 'dist')
    },
    module: {
        rules: [
            {
                test: /\.html$/,
                use: [
                    {
                        loader: 'html-loader',
                        options: {
                            sources: false // 필요에 따라 옵션 설정
                        }
                    }
                ]
            }
        ]
    }
};