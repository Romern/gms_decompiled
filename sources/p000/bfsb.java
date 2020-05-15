package p000;

import com.google.location.bluemoon.inertialanchor.AndroidInertialAnchor;

/* renamed from: bfsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfsb {
    /* renamed from: a */
    static bsdh m97686a(bsff bsff, bftk bftk) {
        bseq i = bser.m115569i();
        i.mo70445g(cevt.f183463a.mo6606a().reInitAccuracyThresholdMultiplierGnss());
        i.mo70446h(cevt.f183463a.mo6606a().reInitAccuracyThresholdMultiplierWifi());
        i.mo70439a(cevt.f183463a.mo6606a().initializationWindowLengthS());
        i.mo70441c(cevt.f183463a.mo6606a().maxGnssEvidenceAgeS());
        i.mo70444f(cevt.f183463a.mo6606a().maxWifiEvidenceAgeS());
        i.mo70443e(cevt.f183463a.mo6606a().maxStepEvidenceAgeS());
        i.mo70440b(cevt.f183463a.mo6606a().maxBearingGapS());
        i.mo70442d(cevt.f183463a.mo6606a().maxGnssWifiDistanceForGnssOnlyM());
        bser a = i.mo70438a();
        bsej K = bsel.m115506K();
        bsgg c = bsgh.m115730c();
        c.mo70528a(System.currentTimeMillis());
        K.f144345a = c.mo70527a();
        K.mo70404b((int) cevt.f183463a.mo6606a().numberOfParticles());
        K.mo70424n(cevt.f183463a.mo6606a().resamplingThreshold());
        K.mo70425o(cevt.f183463a.mo6606a().stepLengthFactor());
        K.mo70426p(cevt.f183463a.mo6606a().stepLengthNoiseSigmaM());
        K.mo70414g(cevt.f183463a.mo6606a().nominalSigmaScaleGnss());
        K.mo70416h(cevt.f183463a.mo6606a().nominalSigmaScaleWifi());
        K.mo70427q(cevt.f183463a.mo6606a().temporalHeadingNoiseSigmaRad());
        K.mo70428r(cevt.f183463a.mo6606a().temporalPositionNoiseSigmaM());
        K.mo70418i(cevt.f183463a.mo6606a().positionEmitThresholdS());
        K.mo70399a(cevt.f183463a.mo6606a().accuracyFactor());
        K.mo70412f(cevt.f183463a.mo6606a().minAccuracyM());
        K.mo70410e(cevt.f183463a.mo6606a().maxAccuracyM());
        K.mo70429s((double) cevt.f183463a.mo6606a().wifiAccuracyUpperBoundBeforeRejectedMm());
        K.mo70423m(cevt.f183463a.mo6606a().flpParticleFusionRejectionThresholdSigmaMultiplier());
        K.mo70413f(cevt.f183463a.mo6606a().flpParticleFusionUsePositionLikelihoodClipping());
        K.mo70419i(cexz.f183503a.mo6606a().useCarryBearingTracker());
        K.mo70415g(cevt.f183463a.mo6606a().resetLocationAfterReinit());
        K.mo70417h(cevt.f183463a.mo6606a().resetLocationAfterReinitV2());
        K.mo70411e(cevt.f183463a.mo6606a().flpParticleFusionExtendedBugReport());
        K.mo70409d(cevt.f183463a.mo6606a().enableDifferentialBearingFix140500114());
        K.mo70402a(cevt.f183463a.mo6606a().allowProposingFromGnss());
        K.mo70421k(cevt.f183463a.mo6606a().positionProposalGnssMaxAccuracyThresholdM());
        K.mo70422l(cevt.f183463a.mo6606a().positionProposalGnssMinSpeedThresholdMps());
        K.f144348d = a;
        bsew f = bsex.m115643f();
        f.mo70480e(cevt.f183463a.mo6606a().gnssStdDevScale());
        f.mo70477b(cevt.f183463a.mo6606a().gnssMinStdDevM());
        f.mo70476a(cevt.f183463a.mo6606a().gnssMaxStdDevM());
        f.mo70478c(cevt.f183463a.mo6606a().gnssRejectionDistanceM());
        f.mo70479d(cevt.f183463a.mo6606a().gnssRejectionPeriodS());
        K.f144346b = f.mo70475a();
        bsew g = bsex.m115644g();
        g.mo70480e(cevt.f183463a.mo6606a().wifiStdDevScale());
        g.mo70477b(cevt.f183463a.mo6606a().wifiMinStdDevM());
        g.mo70476a(cevt.f183463a.mo6606a().wifiMaxStdDevM());
        g.mo70478c(cevt.f183463a.mo6606a().wifiRejectionDistanceM());
        g.mo70479d(cevt.f183463a.mo6606a().wifiRejectionPeriodS());
        K.f144347c = g.mo70475a();
        K.mo70401a(bsff);
        K.mo70400a((int) cevt.f183463a.mo6606a().flpParticleFusionBugReportMaxBufferSize());
        K.mo70408d(cevt.f183463a.mo6606a().flpParticleFusionBugReportWindowSec());
        K.mo70405b(cevt.f183463a.mo6606a().flpParticleFusionBugReportStoreDataArrayOnly());
        K.mo70407c(cevt.m138310b());
        bseo c2 = bsep.m115557c();
        c2.mo70437b(cevt.f183463a.mo6606a().blueskyShadowsProbabilityDensityForInvalidGrid());
        c2.mo70436a(cevt.f183463a.mo6606a().blueskyShadowsProbabilityDeweightingFactor());
        K.f144349e = c2.mo70435a();
        K.mo70403b(cevt.f183463a.mo6606a().blueskyUpdateMaxAgeS());
        K.mo70420j(cevt.f183463a.mo6606a().positionProposalGnssBlueskyMinSpeedThresholdMps());
        K.mo70406c(cevt.f183463a.mo6606a().blueskyUpdateTimeoutForProposeFromGnssSec());
        bsel a2 = K.mo70398a();
        bsem f2 = bsen.m115548f();
        f2.f144371a = a2;
        f2.mo70434c(cevt.f183463a.mo6606a().notRequestWifiScansWhenProposingFromGnss());
        f2.mo70431a(cevt.f183463a.mo6606a().maxGnssAgeForNotRequestingWifiScansS());
        f2.mo70433b(cest.m138205k());
        f2.mo70432a(cevt.f183463a.mo6606a().enableBearingRangeFix143083454());
        bsen a3 = f2.mo70430a();
        bsfj bsfj = new bsfj();
        return new bsdh(bftk, a3, bsfj, new bsfg(((bsed) a3).f144289e, bsfj));
    }

    /* renamed from: a */
    static boolean m97687a(AndroidInertialAnchor androidInertialAnchor) {
        if (!cevt.f183463a.mo6606a().enableInertialAnchorWithoutMagnetometer()) {
            return androidInertialAnchor.mo86636b();
        }
        return androidInertialAnchor.f191728g.isResultSupported(androidInertialAnchor.mo86647e(), 2);
    }
}
