package dev.hugofaria.algadelivery.delivery.tracking.domain.service;

import dev.hugofaria.algadelivery.delivery.tracking.domain.model.ContactPoint;

public interface DeliveryTimeEstimationService {
    DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver);
}