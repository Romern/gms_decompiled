package p000;

/* renamed from: bsej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsej {

    /* renamed from: A */
    private Boolean f144335A;

    /* renamed from: B */
    private Boolean f144336B;

    /* renamed from: C */
    private Boolean f144337C;

    /* renamed from: D */
    private Boolean f144338D;

    /* renamed from: E */
    private Double f144339E;

    /* renamed from: F */
    private Double f144340F;

    /* renamed from: G */
    private bsff f144341G;

    /* renamed from: H */
    private Integer f144342H;

    /* renamed from: I */
    private Double f144343I;

    /* renamed from: J */
    private Boolean f144344J;

    /* renamed from: a */
    public bsgh f144345a;

    /* renamed from: b */
    public bsex f144346b;

    /* renamed from: c */
    public bsex f144347c;

    /* renamed from: d */
    public bser f144348d;

    /* renamed from: e */
    public bsep f144349e;

    /* renamed from: f */
    private Integer f144350f;

    /* renamed from: g */
    private Double f144351g;

    /* renamed from: h */
    private Double f144352h;

    /* renamed from: i */
    private Double f144353i;

    /* renamed from: j */
    private Double f144354j;

    /* renamed from: k */
    private Double f144355k;

    /* renamed from: l */
    private Double f144356l;

    /* renamed from: m */
    private Double f144357m;

    /* renamed from: n */
    private Double f144358n;

    /* renamed from: o */
    private Double f144359o;

    /* renamed from: p */
    private Double f144360p;

    /* renamed from: q */
    private Double f144361q;

    /* renamed from: r */
    private Double f144362r;

    /* renamed from: s */
    private Double f144363s;

    /* renamed from: t */
    private Boolean f144364t;

    /* renamed from: u */
    private Boolean f144365u;

    /* renamed from: v */
    private Double f144366v;

    /* renamed from: w */
    private Double f144367w;

    /* renamed from: x */
    private Double f144368x;

    /* renamed from: y */
    private Boolean f144369y;

    /* renamed from: z */
    private Boolean f144370z;

    /* renamed from: a */
    public final bsel mo70398a() {
        String str = this.f144345a == null ? " seedBox" : "";
        if (this.f144350f == null) {
            str = str.concat(" numberOfParticles");
        }
        if (this.f144351g == null) {
            str = String.valueOf(str).concat(" resamplingThreshold");
        }
        if (this.f144352h == null) {
            str = String.valueOf(str).concat(" stepLengthFactor");
        }
        if (this.f144353i == null) {
            str = String.valueOf(str).concat(" stepLengthNoiseSigmaM");
        }
        if (this.f144354j == null) {
            str = String.valueOf(str).concat(" nominalSigmaScaleGnss");
        }
        if (this.f144355k == null) {
            str = String.valueOf(str).concat(" nominalSigmaScaleWifi");
        }
        if (this.f144356l == null) {
            str = String.valueOf(str).concat(" temporalHeadingNoiseSigmaRad");
        }
        if (this.f144357m == null) {
            str = String.valueOf(str).concat(" temporalPositionNoiseSigmaM");
        }
        if (this.f144358n == null) {
            str = String.valueOf(str).concat(" positionEmitThresholdS");
        }
        if (this.f144359o == null) {
            str = String.valueOf(str).concat(" accuracyFactor");
        }
        if (this.f144360p == null) {
            str = String.valueOf(str).concat(" minAccuracyM");
        }
        if (this.f144361q == null) {
            str = String.valueOf(str).concat(" maxAccuracyM");
        }
        if (this.f144362r == null) {
            str = String.valueOf(str).concat(" wifiReportedAccuracyUpperBoundBeforeRejectedMm");
        }
        if (this.f144363s == null) {
            str = String.valueOf(str).concat(" positionWeightingRejectionThresholdSigmaMultiplier");
        }
        if (this.f144364t == null) {
            str = String.valueOf(str).concat(" positionWeightingUsePositionLikelihoodClipping");
        }
        if (this.f144365u == null) {
            str = String.valueOf(str).concat(" allowProposingFromGnss");
        }
        if (this.f144366v == null) {
            str = String.valueOf(str).concat(" positionProposalGnssMaxAccuracyThresholdM");
        }
        if (this.f144367w == null) {
            str = String.valueOf(str).concat(" positionProposalGnssMinSpeedThresholdMps");
        }
        if (this.f144368x == null) {
            str = String.valueOf(str).concat(" positionProposalGnssBlueskyMinSpeedThresholdMps");
        }
        if (this.f144369y == null) {
            str = String.valueOf(str).concat(" useBearingCarryDetectionFromIA");
        }
        if (this.f144370z == null) {
            str = String.valueOf(str).concat(" resetLocationAfterReinit");
        }
        if (this.f144335A == null) {
            str = String.valueOf(str).concat(" resetLocationAfterReinitV2");
        }
        if (this.f144336B == null) {
            str = String.valueOf(str).concat(" extendedBugreportLogging");
        }
        if (this.f144337C == null) {
            str = String.valueOf(str).concat(" enableDifferentialBearingFix140500114");
        }
        if (this.f144338D == null) {
            str = String.valueOf(str).concat(" enableBlueskyShadowLikelihood");
        }
        if (this.f144339E == null) {
            str = String.valueOf(str).concat(" blueskyUpdateMaxAgeSec");
        }
        if (this.f144340F == null) {
            str = String.valueOf(str).concat(" blueskyUpdateTimeoutForProposeFromGnssSec");
        }
        if (this.f144346b == null) {
            str = String.valueOf(str).concat(" gnssPositionMeasurementConditionerConfiguration");
        }
        if (this.f144347c == null) {
            str = String.valueOf(str).concat(" wifiPositionMeasurementConditionerConfiguration");
        }
        if (this.f144348d == null) {
            str = String.valueOf(str).concat(" filterStatusConfiguration");
        }
        if (this.f144349e == null) {
            str = String.valueOf(str).concat(" blueskyWeightingConfiguration");
        }
        if (this.f144341G == null) {
            str = String.valueOf(str).concat(" bluemoonEventLogger");
        }
        if (this.f144342H == null) {
            str = String.valueOf(str).concat(" bugReportLoggingMaxBufferSize");
        }
        if (this.f144343I == null) {
            str = String.valueOf(str).concat(" bugReportLoggingTimeWindowS");
        }
        if (this.f144344J == null) {
            str = String.valueOf(str).concat(" bugReportStoreDataArrayOnly");
        }
        if (str.isEmpty()) {
            return new bsec(this.f144345a, this.f144350f.intValue(), this.f144351g.doubleValue(), this.f144352h.doubleValue(), this.f144353i.doubleValue(), this.f144354j.doubleValue(), this.f144355k.doubleValue(), this.f144356l.doubleValue(), this.f144357m.doubleValue(), this.f144358n.doubleValue(), this.f144359o.doubleValue(), this.f144360p.doubleValue(), this.f144361q.doubleValue(), this.f144362r.doubleValue(), this.f144363s.doubleValue(), this.f144364t.booleanValue(), this.f144365u.booleanValue(), this.f144366v.doubleValue(), this.f144367w.doubleValue(), this.f144368x.doubleValue(), this.f144369y.booleanValue(), this.f144370z.booleanValue(), this.f144335A.booleanValue(), this.f144336B.booleanValue(), this.f144337C.booleanValue(), this.f144338D.booleanValue(), this.f144339E.doubleValue(), this.f144340F.doubleValue(), this.f144346b, this.f144347c, this.f144348d, this.f144349e, this.f144341G, this.f144342H.intValue(), this.f144343I.doubleValue(), this.f144344J.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo70403b(double d) {
        this.f144339E = Double.valueOf(d);
    }

    /* renamed from: c */
    public final void mo70406c(double d) {
        this.f144340F = Double.valueOf(d);
    }

    /* renamed from: d */
    public final void mo70408d(double d) {
        this.f144343I = Double.valueOf(d);
    }

    /* renamed from: e */
    public final void mo70410e(double d) {
        this.f144361q = Double.valueOf(d);
    }

    /* renamed from: f */
    public final void mo70412f(double d) {
        this.f144360p = Double.valueOf(d);
    }

    /* renamed from: g */
    public final void mo70414g(double d) {
        this.f144354j = Double.valueOf(d);
    }

    /* renamed from: h */
    public final void mo70416h(double d) {
        this.f144355k = Double.valueOf(d);
    }

    /* renamed from: i */
    public final void mo70418i(double d) {
        this.f144358n = Double.valueOf(d);
    }

    /* renamed from: j */
    public final void mo70420j(double d) {
        this.f144368x = Double.valueOf(d);
    }

    /* renamed from: k */
    public final void mo70421k(double d) {
        this.f144366v = Double.valueOf(d);
    }

    /* renamed from: l */
    public final void mo70422l(double d) {
        this.f144367w = Double.valueOf(d);
    }

    /* renamed from: m */
    public final void mo70423m(double d) {
        this.f144363s = Double.valueOf(d);
    }

    /* renamed from: n */
    public final void mo70424n(double d) {
        this.f144351g = Double.valueOf(d);
    }

    /* renamed from: o */
    public final void mo70425o(double d) {
        this.f144352h = Double.valueOf(d);
    }

    /* renamed from: p */
    public final void mo70426p(double d) {
        this.f144353i = Double.valueOf(d);
    }

    /* renamed from: q */
    public final void mo70427q(double d) {
        this.f144356l = Double.valueOf(d);
    }

    /* renamed from: r */
    public final void mo70428r(double d) {
        this.f144357m = Double.valueOf(d);
    }

    /* renamed from: s */
    public final void mo70429s(double d) {
        this.f144362r = Double.valueOf(d);
    }

    /* renamed from: b */
    public final void mo70404b(int i) {
        this.f144350f = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo70407c(boolean z) {
        this.f144338D = Boolean.valueOf(z);
    }

    /* renamed from: d */
    public final void mo70409d(boolean z) {
        this.f144337C = Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final void mo70411e(boolean z) {
        this.f144336B = Boolean.valueOf(z);
    }

    /* renamed from: f */
    public final void mo70413f(boolean z) {
        this.f144364t = Boolean.valueOf(z);
    }

    /* renamed from: g */
    public final void mo70415g(boolean z) {
        this.f144370z = Boolean.valueOf(z);
    }

    /* renamed from: h */
    public final void mo70417h(boolean z) {
        this.f144335A = Boolean.valueOf(z);
    }

    /* renamed from: i */
    public final void mo70419i(boolean z) {
        this.f144369y = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void mo70405b(boolean z) {
        this.f144344J = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo70399a(double d) {
        this.f144359o = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo70400a(int i) {
        this.f144342H = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo70401a(bsff bsff) {
        if (bsff != null) {
            this.f144341G = bsff;
            return;
        }
        throw new NullPointerException("Null bluemoonEventLogger");
    }

    /* renamed from: a */
    public final void mo70402a(boolean z) {
        this.f144365u = Boolean.valueOf(z);
    }
}
