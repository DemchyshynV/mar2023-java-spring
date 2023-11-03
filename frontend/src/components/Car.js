import {urls} from "../constants/urls";

const Car = ({car}) => {
    const {id, producer, model, power, photo} = car;

    return (
        <div>
            <div>id: {id}</div>
            <div>producer: {producer}</div>
            <div>model: {model}</div>
            <div>power: {power}</div>
            {photo && <img width={'200px'} src={urls.media(photo)} alt={producer}/>}
        </div>
    );
};

export {Car};