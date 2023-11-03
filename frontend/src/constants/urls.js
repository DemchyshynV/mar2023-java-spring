const baseURL = '/api'

const urls = {
    cars: '/cars',
    media: (imageName) => `${baseURL}/media/${imageName}`
}

export {
    baseURL,
    urls
}