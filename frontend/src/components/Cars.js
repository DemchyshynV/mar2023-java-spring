import {useEffect, useState} from "react";
import {carService} from "../services/carService";
import {Car} from "./Car";

const Cars = () => {
    const [cars, setCars] = useState([])


    useEffect(() => {
        carService.getAll().then(({data}) => setCars(data))
    }, [])

    return (
        <div>
            <h1>Cars:</h1>
            {cars.map(car => <Car key={car.id} car={car}/>)}
        </div>
    );
};

export {Cars};