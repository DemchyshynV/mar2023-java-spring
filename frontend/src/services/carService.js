import {axiosService} from "./axiosService";
import {urls} from "../constants/urls";

const carService = {
    getAll: () => axiosService.get(urls.cars),
    getPhoto: (image) => axiosService.get(urls.media(image))
}

export {
    carService
}