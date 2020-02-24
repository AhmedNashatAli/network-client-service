package com.ics.network.client.app.service;

import com.ics.network.client.app.model.Input;
import com.ics.network.client.app.model.Result;

public interface CalculationsService {
    Result multiply(Input input);

    Result add(Input input);

    Result divide(Input input);

}
