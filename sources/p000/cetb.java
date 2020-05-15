package p000;

/* renamed from: cetb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cetb implements cesx {
    public static final bdyx bearingKfMaxBackwardsJumpSec;
    public static final bdyx bearingKfMaxGapBetweenUpdatesSec;
    public static final bdyx bearingKfQSigmaBrgAccRadPerSec2;
    public static final bdyx bearingKfQSigmaBrgRateRadPerSec;
    public static final bdyx bearingKfThresholdVarianceThetaRadSquared;
    public static final bdyx blueskyAdditionalClearcutLogging;
    public static final bdyx blueskyAllPixelsInBuildingFixB151637861;
    public static final bdyx blueskyBugreportLogExpirationTimeMinutes;
    public static final bdyx blueskyBugreportLogSize;
    public static final bdyx blueskyCheckPermissions;
    public static final bdyx blueskyChipsetCorrectionTimeOfWeek;
    public static final bdyx blueskyComputeProbLosForAllSats;
    public static final bdyx blueskyComputeProbLosWithMinigrid;
    public static final bdyx blueskyConstructLatLngKfAndBearingKfFromGcl;
    public static final bdyx blueskyDisableWhenScreenOff;
    public static final bdyx blueskyEnableBugreportLogs;
    public static final bdyx blueskyEnableClearcutStats;
    public static final bdyx blueskyEnableHardwareListener;
    public static final bdyx blueskyEnableMddGeofence;
    public static final bdyx blueskyEnabled;
    public static final bdyx blueskyExtendGridCoveringFlpGnss;
    public static final bdyx blueskyExtraBoundingRadiusToLoadGeodataMeters;
    public static final bdyx blueskyInVehicleStickinessSec;
    public static final bdyx blueskyIscbScaledDbhz;
    public static final bdyx blueskyIscbUseGclValue;
    public static final bdyx blueskyMaxGridRadiusMeters;
    public static final bdyx blueskyMinTravelDistanceToComputeCorrectionsMeters;
    public static final bdyx blueskyOnFootStickinessSec;
    public static final bdyx blueskyOpenskyMinCn0DbhzForLos;
    public static final bdyx blueskyOpenskyMinElevationDegForLos;
    public static final bdyx blueskyOpenskyMinNumLosGnssSignals;
    public static final bdyx blueskyOpenskyMinNumLosGpsSignals;
    public static final bdyx blueskyRaytracingCalculationRadiusMeters;
    public static final bdyx blueskyReportedSigmaMultiplier;
    public static final bdyx blueskyS2Geofence;
    public static final bdyx blueskySatelliteMotionFixB148574152;
    public static final bdyx blueskySatelliteMotionThresholdDeg;
    public static final bdyx blueskyScreenOffDisableTimeoutSec;
    public static final bdyx blueskyTileCacheFixB149114011;
    public static final bdyx blueskyTileDiskCacheSize;
    public static final bdyx blueskyTileSize;
    public static final bdyx blueskyTileVersion;
    public static final bdyx blueskyTileZoomLevel;
    public static final bdyx blueskyTreatUnknownActivityAsOnfoot;
    public static final bdyx blueskyUpdateOnTinyMovement;
    public static final bdyx blueskyUseGnssAsGridCenter;
    public static final bdyx blueskyUseImmutableLocalRaster;
    public static final bdyx blueskyUseLocationCompat;
    public static final bdyx blueskyUseRasterAltitudeForChipsetCorrection;
    public static final bdyx blueskyUtcSecondsAtLeaps;
    public static final bdyx blueskyWeightToGpsAccuracy;
    public static final bdyx latLngKfBearingAccuracyRad;
    public static final bdyx latLngKfInitVelocityUncertaintyMps;
    public static final bdyx latLngKfMaxBackwardsJumpSec;
    public static final bdyx latLngKfMaxGapBetweenUpdatesSec;
    public static final bdyx latLngKfMeasurementErrorResetThresholdMeters;
    public static final bdyx latLngKfQSigmaAccelWalkMps2;
    public static final bdyx latLngKfSigmaVelThresholdMps;
    public static final bdyx latLngKfSpeedAccuracyMps;
    public static final bdyx minigridMinAllowedHorizontalPositionSigmaMeters;
    public static final bdyx minigridNumberOfPointsInInnerCircle;
    public static final bdyx minigridRadiusOfInnerCircleMeters;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.location")).mo58445a("location:");
        bearingKfMaxBackwardsJumpSec = bdyx.m91605a(a, "Bluesky__bearing_kf_max_backwards_jump_sec", -2.0d);
        bearingKfMaxGapBetweenUpdatesSec = bdyx.m91605a(a, "Bluesky__bearing_kf_max_gap_between_updates_sec", 15.0d);
        bearingKfQSigmaBrgAccRadPerSec2 = bdyx.m91605a(a, "Bluesky__bearing_kf_q_sigma_brg_acc_rad_per_sec2", 0.261799d);
        bearingKfQSigmaBrgRateRadPerSec = bdyx.m91605a(a, "Bluesky__bearing_kf_q_sigma_brg_rate_rad_per_sec", 0.261799d);
        bearingKfThresholdVarianceThetaRadSquared = bdyx.m91605a(a, "Bluesky__bearing_kf_threshold_variance_theta_rad_squared", 9.8696d);
        blueskyAdditionalClearcutLogging = bdyx.m91610a(a, "Bluesky__bluesky_additional_clearcut_logging", false);
        blueskyAllPixelsInBuildingFixB151637861 = bdyx.m91610a(a, "Bluesky__bluesky_all_pixels_in_building_fix_b151637861", false);
        blueskyBugreportLogExpirationTimeMinutes = bdyx.m91607a(a, "Bluesky__bluesky_bugreport_log_expiration_time_minutes", 10L);
        blueskyBugreportLogSize = bdyx.m91607a(a, "Bluesky__bluesky_bugreport_log_size", 600L);
        blueskyCheckPermissions = bdyx.m91610a(a, "Bluesky__bluesky_check_permissions", false);
        blueskyChipsetCorrectionTimeOfWeek = bdyx.m91610a(a, "Bluesky__bluesky_chipset_correction_time_of_week", false);
        blueskyComputeProbLosForAllSats = bdyx.m91610a(a, "Bluesky__bluesky_compute_prob_los_for_all_sats", false);
        blueskyComputeProbLosWithMinigrid = bdyx.m91610a(a, "Bluesky__bluesky_compute_prob_los_with_minigrid", true);
        blueskyConstructLatLngKfAndBearingKfFromGcl = bdyx.m91610a(a, "Bluesky__bluesky_construct_lat_lng_kf_and_bearing_kf_from_gcl", false);
        blueskyDisableWhenScreenOff = bdyx.m91610a(a, "Bluesky__bluesky_disable_when_screen_off", true);
        blueskyEnableBugreportLogs = bdyx.m91610a(a, "Bluesky__bluesky_enable_bugreport_logs", false);
        blueskyEnableClearcutStats = bdyx.m91610a(a, "Bluesky__bluesky_enable_clearcut_stats", true);
        blueskyEnableHardwareListener = bdyx.m91610a(a, "Bluesky__bluesky_enable_hardware_listener", false);
        blueskyEnableMddGeofence = bdyx.m91610a(a, "Bluesky__bluesky_enable_mdd_geofence", false);
        blueskyEnabled = bdyx.m91610a(a, "Bluesky__bluesky_enabled", false);
        blueskyExtendGridCoveringFlpGnss = bdyx.m91610a(a, "Bluesky__bluesky_extend_grid_covering_flp_gnss", false);
        blueskyExtraBoundingRadiusToLoadGeodataMeters = bdyx.m91607a(a, "Bluesky__bluesky_extra_bounding_radius_to_load_geodata_meters", 100L);
        blueskyInVehicleStickinessSec = bdyx.m91607a(a, "Bluesky__bluesky_in_vehicle_stickiness_sec", 10L);
        try {
            blueskyIscbScaledDbhz = bdyx.m91608a(a, "Bluesky__bluesky_iscb_scaled_dbhz", (bydh) bxvk.m124014a(bydh.f165789b, new byte[]{10, 90, -24, -3, -1, -1, -1, -1, -1, -1, -1, 1, -114, -3, -1, -1, -1, -1, -1, -1, -1, 1, -96, -4, -1, -1, -1, -1, -1, -1, -1, 1, -28, -5, -1, -1, -1, -1, -1, -1, -1, 1, -34, -3, -1, -1, -1, -1, -1, -1, -1, 1, -8, -5, -1, -1, -1, -1, -1, -1, -1, 1, -8, -5, -1, -1, -1, -1, -1, -1, -1, 1, -94, -3, -1, -1, -1, -1, -1, -1, -1, 1, -88, -5, -1, -1, -1, -1, -1, -1, -1, 1}), cesy.f183413a);
            blueskyIscbUseGclValue = bdyx.m91610a(a, "Bluesky__bluesky_iscb_use_gcl_value", true);
            blueskyMaxGridRadiusMeters = bdyx.m91607a(a, "Bluesky__bluesky_max_grid_radius_meters", 100L);
            blueskyMinTravelDistanceToComputeCorrectionsMeters = bdyx.m91605a(a, "Bluesky__bluesky_min_travel_distance_to_compute_corrections_meters", 1.0d);
            blueskyOnFootStickinessSec = bdyx.m91607a(a, "Bluesky__bluesky_on_foot_stickiness_sec", 90L);
            blueskyOpenskyMinCn0DbhzForLos = bdyx.m91605a(a, "Bluesky__bluesky_opensky_min_cn0_dbhz_for_los", 27.0d);
            blueskyOpenskyMinElevationDegForLos = bdyx.m91605a(a, "Bluesky__bluesky_opensky_min_elevation_deg_for_los", 30.0d);
            blueskyOpenskyMinNumLosGnssSignals = bdyx.m91607a(a, "Bluesky__bluesky_opensky_min_num_los_gnss_signals", 2L);
            blueskyOpenskyMinNumLosGpsSignals = bdyx.m91607a(a, "Bluesky__bluesky_opensky_min_num_los_gps_signals", 1L);
            blueskyRaytracingCalculationRadiusMeters = bdyx.m91607a(a, "Bluesky__bluesky_raytracing_calculation_radius_meters", 280L);
            blueskyReportedSigmaMultiplier = bdyx.m91605a(a, "Bluesky__bluesky_reported_sigma_multiplier", 1.0d);
            try {
                blueskyS2Geofence = bdyx.m91608a(a, "Bluesky__bluesky_s2_geofence", (bydi) bxvk.m124014a(bydi.f165792b, new byte[]{10, -93, 1, Byte.MIN_VALUE, -114, -106, -124, 8, Byte.MIN_VALUE, -126, -106, -124, 8, Byte.MIN_VALUE, -8, -67, -124, 8, Byte.MIN_VALUE, -24, -66, -124, 8, Byte.MIN_VALUE, -104, -65, -124, 8, -64, -13, -66, -124, 8, -64, -12, -66, -124, 8, Byte.MIN_VALUE, -24, -72, -124, 8, -64, -68, -13, -122, 8, Byte.MIN_VALUE, -120, -40, -61, 4, Byte.MIN_VALUE, -74, -40, -61, 4, Byte.MIN_VALUE, -70, -40, -61, 4, Byte.MIN_VALUE, -24, -117, -50, 8, Byte.MIN_VALUE, -72, -119, -50, 8, Byte.MIN_VALUE, -104, -95, -67, 4, Byte.MIN_VALUE, -88, -95, -67, 4, Byte.MIN_VALUE, -96, -24, -114, 3, Byte.MIN_VALUE, -32, -24, -114, 3, Byte.MIN_VALUE, Byte.MIN_VALUE, -101, -68, 4, Byte.MIN_VALUE, -32, -120, 106, Byte.MIN_VALUE, -96, -122, 106, Byte.MIN_VALUE, -32, -103, -65, 4, Byte.MIN_VALUE, -96, -71, -90, 9, Byte.MIN_VALUE, -32, -69, -90, 9, Byte.MIN_VALUE, -96, -30, Byte.MIN_VALUE, 6, Byte.MIN_VALUE, -32, -29, Byte.MIN_VALUE, 6, -80, -41, -118, -94, 3, -52, -41, -118, -94, 3, -57, -41, -118, -94, 3, -63, -41, -118, -94, 3, -116, -46, -118, -94, 3, -109, -46, -118, -94, 3, -16, -46, -118, -94, 3}), cesz.f183414a);
                blueskySatelliteMotionFixB148574152 = bdyx.m91610a(a, "Bluesky__bluesky_satellite_motion_fix_b148574152", false);
                blueskySatelliteMotionThresholdDeg = bdyx.m91605a(a, "Bluesky__bluesky_satellite_motion_threshold_deg", 2.0d);
                blueskyScreenOffDisableTimeoutSec = bdyx.m91607a(a, "Bluesky__bluesky_screen_off_disable_timeout_sec", 60L);
                blueskyTileCacheFixB149114011 = bdyx.m91610a(a, "Bluesky__bluesky_tile_cache_fix_b149114011", false);
                blueskyTileDiskCacheSize = bdyx.m91607a(a, "Bluesky__bluesky_tile_disk_cache_size", 100L);
                blueskyTileSize = bdyx.m91607a(a, "Bluesky__bluesky_tile_size", 512L);
                blueskyTileVersion = bdyx.m91607a(a, "Bluesky__bluesky_tile_version", 2L);
                blueskyTileZoomLevel = bdyx.m91607a(a, "Bluesky__bluesky_tile_zoom_level", 19L);
                blueskyTreatUnknownActivityAsOnfoot = bdyx.m91610a(a, "Bluesky__bluesky_treat_unknown_activity_as_onfoot", true);
                blueskyUpdateOnTinyMovement = bdyx.m91610a(a, "Bluesky__bluesky_update_on_tiny_movement", true);
                blueskyUseGnssAsGridCenter = bdyx.m91610a(a, "Bluesky__bluesky_use_gnss_as_grid_center", false);
                blueskyUseImmutableLocalRaster = bdyx.m91610a(a, "Bluesky__bluesky_use_immutable_local_raster", false);
                blueskyUseLocationCompat = bdyx.m91610a(a, "Bluesky__bluesky_use_location_compat", true);
                blueskyUseRasterAltitudeForChipsetCorrection = bdyx.m91610a(a, "Bluesky__bluesky_use_raster_altitude_for_chipset_correction", false);
                try {
                    blueskyUtcSecondsAtLeaps = bdyx.m91608a(a, "Bluesky__bluesky_utc_seconds_at_leaps", (bydh) bxvk.m124014a(bydh.f165789b, new byte[]{10, 90, Byte.MIN_VALUE, -67, -55, -76, 1, Byte.MIN_VALUE, -4, -125, -68, 1, Byte.MIN_VALUE, -29, -120, -53, 1, Byte.MIN_VALUE, -44, -105, -23, 1, Byte.MIN_VALUE, -54, -21, -114, 2, Byte.MIN_VALUE, -69, -6, -84, 2, Byte.MIN_VALUE, -94, -1, -69, 2, Byte.MIN_VALUE, -21, -61, -46, 2, Byte.MIN_VALUE, -46, -56, -31, 2, Byte.MIN_VALUE, -71, -51, -16, 2, Byte.MIN_VALUE, -56, -100, -121, 3, Byte.MIN_VALUE, -111, -31, -99, 3, Byte.MIN_VALUE, -96, -80, -76, 3, Byte.MIN_VALUE, -73, -36, -99, 4, Byte.MIN_VALUE, -113, -16, -54, 4, Byte.MIN_VALUE, -90, -66, -1, 4, Byte.MIN_VALUE, -37, -52, -84, 5, Byte.MIN_VALUE, -115, -95, -61, 5}), ceta.f183415a);
                    blueskyWeightToGpsAccuracy = bdyx.m91605a(a, "Bluesky__bluesky_weight_to_gps_accuracy", 0.1d);
                    latLngKfBearingAccuracyRad = bdyx.m91605a(a, "Bluesky__lat_lng_kf_bearing_accuracy_rad", 0.261799d);
                    latLngKfInitVelocityUncertaintyMps = bdyx.m91605a(a, "Bluesky__lat_lng_kf_init_velocity_uncertainty_mps", 1.5d);
                    latLngKfMaxBackwardsJumpSec = bdyx.m91605a(a, "Bluesky__lat_lng_kf_max_backwards_jump_sec", -2.0d);
                    latLngKfMaxGapBetweenUpdatesSec = bdyx.m91605a(a, "Bluesky__lat_lng_kf_max_gap_between_updates_sec", 15.0d);
                    latLngKfMeasurementErrorResetThresholdMeters = bdyx.m91605a(a, "Bluesky__lat_lng_kf_measurement_error_reset_threshold_meters", 250.0d);
                    latLngKfQSigmaAccelWalkMps2 = bdyx.m91605a(a, "Bluesky__lat_lng_kf_q_sigma_accel_walk_mps2", 1.0d);
                    latLngKfSigmaVelThresholdMps = bdyx.m91605a(a, "Bluesky__lat_lng_kf_sigma_vel_threshold_mps", 0.3d);
                    latLngKfSpeedAccuracyMps = bdyx.m91605a(a, "Bluesky__lat_lng_kf_speed_accuracy_mps", 0.9d);
                    minigridMinAllowedHorizontalPositionSigmaMeters = bdyx.m91605a(a, "Bluesky__minigrid_min_allowed_horizontal_position_sigma_meters", 3.0d);
                    minigridNumberOfPointsInInnerCircle = bdyx.m91607a(a, "Bluesky__minigrid_number_of_points_in_inner_circle", 4L);
                    minigridRadiusOfInnerCircleMeters = bdyx.m91605a(a, "Bluesky__minigrid_radius_of_inner_circle_meters", 2.0d);
                } catch (bxwf e) {
                    throw new AssertionError("Could not parse proto flag \"Bluesky__bluesky_utc_seconds_at_leaps\"");
                }
            } catch (bxwf e2) {
                throw new AssertionError("Could not parse proto flag \"Bluesky__bluesky_s2_geofence\"");
            }
        } catch (bxwf e3) {
            throw new AssertionError("Could not parse proto flag \"Bluesky__bluesky_iscb_scaled_dbhz\"");
        }
    }

    public double bearingKfMaxBackwardsJumpSec() {
        return ((Double) bearingKfMaxBackwardsJumpSec.mo58455c()).doubleValue();
    }

    public double bearingKfMaxGapBetweenUpdatesSec() {
        return ((Double) bearingKfMaxGapBetweenUpdatesSec.mo58455c()).doubleValue();
    }

    public double bearingKfQSigmaBrgAccRadPerSec2() {
        return ((Double) bearingKfQSigmaBrgAccRadPerSec2.mo58455c()).doubleValue();
    }

    public double bearingKfQSigmaBrgRateRadPerSec() {
        return ((Double) bearingKfQSigmaBrgRateRadPerSec.mo58455c()).doubleValue();
    }

    public double bearingKfThresholdVarianceThetaRadSquared() {
        return ((Double) bearingKfThresholdVarianceThetaRadSquared.mo58455c()).doubleValue();
    }

    public boolean blueskyAdditionalClearcutLogging() {
        return ((Boolean) blueskyAdditionalClearcutLogging.mo58455c()).booleanValue();
    }

    public boolean blueskyAllPixelsInBuildingFixB151637861() {
        return ((Boolean) blueskyAllPixelsInBuildingFixB151637861.mo58455c()).booleanValue();
    }

    public long blueskyBugreportLogExpirationTimeMinutes() {
        return ((Long) blueskyBugreportLogExpirationTimeMinutes.mo58455c()).longValue();
    }

    public long blueskyBugreportLogSize() {
        return ((Long) blueskyBugreportLogSize.mo58455c()).longValue();
    }

    public boolean blueskyCheckPermissions() {
        return ((Boolean) blueskyCheckPermissions.mo58455c()).booleanValue();
    }

    public boolean blueskyChipsetCorrectionTimeOfWeek() {
        return ((Boolean) blueskyChipsetCorrectionTimeOfWeek.mo58455c()).booleanValue();
    }

    public boolean blueskyComputeProbLosForAllSats() {
        return ((Boolean) blueskyComputeProbLosForAllSats.mo58455c()).booleanValue();
    }

    public boolean blueskyComputeProbLosWithMinigrid() {
        return ((Boolean) blueskyComputeProbLosWithMinigrid.mo58455c()).booleanValue();
    }

    public boolean blueskyConstructLatLngKfAndBearingKfFromGcl() {
        return ((Boolean) blueskyConstructLatLngKfAndBearingKfFromGcl.mo58455c()).booleanValue();
    }

    public boolean blueskyDisableWhenScreenOff() {
        return ((Boolean) blueskyDisableWhenScreenOff.mo58455c()).booleanValue();
    }

    public boolean blueskyEnableBugreportLogs() {
        return ((Boolean) blueskyEnableBugreportLogs.mo58455c()).booleanValue();
    }

    public boolean blueskyEnableClearcutStats() {
        return ((Boolean) blueskyEnableClearcutStats.mo58455c()).booleanValue();
    }

    public boolean blueskyEnableHardwareListener() {
        return ((Boolean) blueskyEnableHardwareListener.mo58455c()).booleanValue();
    }

    public boolean blueskyEnableMddGeofence() {
        return ((Boolean) blueskyEnableMddGeofence.mo58455c()).booleanValue();
    }

    public boolean blueskyEnabled() {
        return ((Boolean) blueskyEnabled.mo58455c()).booleanValue();
    }

    public boolean blueskyExtendGridCoveringFlpGnss() {
        return ((Boolean) blueskyExtendGridCoveringFlpGnss.mo58455c()).booleanValue();
    }

    public long blueskyExtraBoundingRadiusToLoadGeodataMeters() {
        return ((Long) blueskyExtraBoundingRadiusToLoadGeodataMeters.mo58455c()).longValue();
    }

    public long blueskyInVehicleStickinessSec() {
        return ((Long) blueskyInVehicleStickinessSec.mo58455c()).longValue();
    }

    public bydh blueskyIscbScaledDbhz() {
        return (bydh) blueskyIscbScaledDbhz.mo58455c();
    }

    public boolean blueskyIscbUseGclValue() {
        return ((Boolean) blueskyIscbUseGclValue.mo58455c()).booleanValue();
    }

    public long blueskyMaxGridRadiusMeters() {
        return ((Long) blueskyMaxGridRadiusMeters.mo58455c()).longValue();
    }

    public double blueskyMinTravelDistanceToComputeCorrectionsMeters() {
        return ((Double) blueskyMinTravelDistanceToComputeCorrectionsMeters.mo58455c()).doubleValue();
    }

    public long blueskyOnFootStickinessSec() {
        return ((Long) blueskyOnFootStickinessSec.mo58455c()).longValue();
    }

    public double blueskyOpenskyMinCn0DbhzForLos() {
        return ((Double) blueskyOpenskyMinCn0DbhzForLos.mo58455c()).doubleValue();
    }

    public double blueskyOpenskyMinElevationDegForLos() {
        return ((Double) blueskyOpenskyMinElevationDegForLos.mo58455c()).doubleValue();
    }

    public long blueskyOpenskyMinNumLosGnssSignals() {
        return ((Long) blueskyOpenskyMinNumLosGnssSignals.mo58455c()).longValue();
    }

    public long blueskyOpenskyMinNumLosGpsSignals() {
        return ((Long) blueskyOpenskyMinNumLosGpsSignals.mo58455c()).longValue();
    }

    public long blueskyRaytracingCalculationRadiusMeters() {
        return ((Long) blueskyRaytracingCalculationRadiusMeters.mo58455c()).longValue();
    }

    public double blueskyReportedSigmaMultiplier() {
        return ((Double) blueskyReportedSigmaMultiplier.mo58455c()).doubleValue();
    }

    public bydi blueskyS2Geofence() {
        return (bydi) blueskyS2Geofence.mo58455c();
    }

    public boolean blueskySatelliteMotionFixB148574152() {
        return ((Boolean) blueskySatelliteMotionFixB148574152.mo58455c()).booleanValue();
    }

    public double blueskySatelliteMotionThresholdDeg() {
        return ((Double) blueskySatelliteMotionThresholdDeg.mo58455c()).doubleValue();
    }

    public long blueskyScreenOffDisableTimeoutSec() {
        return ((Long) blueskyScreenOffDisableTimeoutSec.mo58455c()).longValue();
    }

    public boolean blueskyTileCacheFixB149114011() {
        return ((Boolean) blueskyTileCacheFixB149114011.mo58455c()).booleanValue();
    }

    public long blueskyTileDiskCacheSize() {
        return ((Long) blueskyTileDiskCacheSize.mo58455c()).longValue();
    }

    public long blueskyTileSize() {
        return ((Long) blueskyTileSize.mo58455c()).longValue();
    }

    public long blueskyTileVersion() {
        return ((Long) blueskyTileVersion.mo58455c()).longValue();
    }

    public long blueskyTileZoomLevel() {
        return ((Long) blueskyTileZoomLevel.mo58455c()).longValue();
    }

    public boolean blueskyTreatUnknownActivityAsOnfoot() {
        return ((Boolean) blueskyTreatUnknownActivityAsOnfoot.mo58455c()).booleanValue();
    }

    public boolean blueskyUpdateOnTinyMovement() {
        return ((Boolean) blueskyUpdateOnTinyMovement.mo58455c()).booleanValue();
    }

    public boolean blueskyUseGnssAsGridCenter() {
        return ((Boolean) blueskyUseGnssAsGridCenter.mo58455c()).booleanValue();
    }

    public boolean blueskyUseImmutableLocalRaster() {
        return ((Boolean) blueskyUseImmutableLocalRaster.mo58455c()).booleanValue();
    }

    public boolean blueskyUseLocationCompat() {
        return ((Boolean) blueskyUseLocationCompat.mo58455c()).booleanValue();
    }

    public boolean blueskyUseRasterAltitudeForChipsetCorrection() {
        return ((Boolean) blueskyUseRasterAltitudeForChipsetCorrection.mo58455c()).booleanValue();
    }

    public bydh blueskyUtcSecondsAtLeaps() {
        return (bydh) blueskyUtcSecondsAtLeaps.mo58455c();
    }

    public double blueskyWeightToGpsAccuracy() {
        return ((Double) blueskyWeightToGpsAccuracy.mo58455c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public double latLngKfBearingAccuracyRad() {
        return ((Double) latLngKfBearingAccuracyRad.mo58455c()).doubleValue();
    }

    public double latLngKfInitVelocityUncertaintyMps() {
        return ((Double) latLngKfInitVelocityUncertaintyMps.mo58455c()).doubleValue();
    }

    public double latLngKfMaxBackwardsJumpSec() {
        return ((Double) latLngKfMaxBackwardsJumpSec.mo58455c()).doubleValue();
    }

    public double latLngKfMaxGapBetweenUpdatesSec() {
        return ((Double) latLngKfMaxGapBetweenUpdatesSec.mo58455c()).doubleValue();
    }

    public double latLngKfMeasurementErrorResetThresholdMeters() {
        return ((Double) latLngKfMeasurementErrorResetThresholdMeters.mo58455c()).doubleValue();
    }

    public double latLngKfQSigmaAccelWalkMps2() {
        return ((Double) latLngKfQSigmaAccelWalkMps2.mo58455c()).doubleValue();
    }

    public double latLngKfSigmaVelThresholdMps() {
        return ((Double) latLngKfSigmaVelThresholdMps.mo58455c()).doubleValue();
    }

    public double latLngKfSpeedAccuracyMps() {
        return ((Double) latLngKfSpeedAccuracyMps.mo58455c()).doubleValue();
    }

    public double minigridMinAllowedHorizontalPositionSigmaMeters() {
        return ((Double) minigridMinAllowedHorizontalPositionSigmaMeters.mo58455c()).doubleValue();
    }

    public long minigridNumberOfPointsInInnerCircle() {
        return ((Long) minigridNumberOfPointsInInnerCircle.mo58455c()).longValue();
    }

    public double minigridRadiusOfInnerCircleMeters() {
        return ((Double) minigridRadiusOfInnerCircleMeters.mo58455c()).doubleValue();
    }
}
