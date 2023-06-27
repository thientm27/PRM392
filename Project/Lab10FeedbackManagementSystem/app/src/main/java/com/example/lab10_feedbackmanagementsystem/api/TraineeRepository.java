package com.example.lab10_feedbackmanagementsystem.api;

import com.example.lab10_feedbackmanagementsystem.model.TraineeService;

public class TraineeRepository {
    public static TraineeService getTraineeService() {
        return APIClient.getClient().create(TraineeService.class);
    }
}
