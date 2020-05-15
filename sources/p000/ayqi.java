package p000;

/* renamed from: ayqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayqi {

    /* renamed from: A */
    private Integer f98232A;

    /* renamed from: B */
    private Integer f98233B;

    /* renamed from: C */
    private Integer f98234C;

    /* renamed from: D */
    private Integer f98235D;

    /* renamed from: E */
    private Boolean f98236E;

    /* renamed from: F */
    private Boolean f98237F;

    /* renamed from: G */
    private Boolean f98238G;

    /* renamed from: H */
    private Boolean f98239H;

    /* renamed from: I */
    private Integer f98240I;

    /* renamed from: J */
    private Boolean f98241J;

    /* renamed from: K */
    private Boolean f98242K;

    /* renamed from: L */
    private Boolean f98243L;

    /* renamed from: M */
    private Boolean f98244M;

    /* renamed from: N */
    private Boolean f98245N;

    /* renamed from: O */
    private Boolean f98246O;

    /* renamed from: P */
    private Boolean f98247P;

    /* renamed from: Q */
    private Boolean f98248Q;

    /* renamed from: R */
    private Boolean f98249R;

    /* renamed from: S */
    private Integer f98250S;

    /* renamed from: T */
    private Boolean f98251T;

    /* renamed from: U */
    private Boolean f98252U;

    /* renamed from: V */
    private Boolean f98253V;

    /* renamed from: W */
    private Boolean f98254W;

    /* renamed from: X */
    private Boolean f98255X;

    /* renamed from: Y */
    private Boolean f98256Y;

    /* renamed from: Z */
    private Boolean f98257Z;

    /* renamed from: a */
    public Short f98258a;

    /* renamed from: aa */
    private Integer f98259aa;

    /* renamed from: ab */
    private Boolean f98260ab;

    /* renamed from: ac */
    private Boolean f98261ac;

    /* renamed from: ad */
    private Boolean f98262ad;

    /* renamed from: ae */
    private Integer f98263ae;

    /* renamed from: b */
    public byte[] f98264b;

    /* renamed from: c */
    private Integer f98265c;

    /* renamed from: d */
    private Integer f98266d;

    /* renamed from: e */
    private Integer f98267e;

    /* renamed from: f */
    private Integer f98268f;

    /* renamed from: g */
    private Integer f98269g;

    /* renamed from: h */
    private Integer f98270h;

    /* renamed from: i */
    private Integer f98271i;

    /* renamed from: j */
    private Boolean f98272j;

    /* renamed from: k */
    private Integer f98273k;

    /* renamed from: l */
    private Integer f98274l;

    /* renamed from: m */
    private Integer f98275m;

    /* renamed from: n */
    private Integer f98276n;

    /* renamed from: o */
    private Integer f98277o;

    /* renamed from: p */
    private Boolean f98278p;

    /* renamed from: q */
    private Boolean f98279q;

    /* renamed from: r */
    private Integer f98280r;

    /* renamed from: s */
    private Integer f98281s;

    /* renamed from: t */
    private Boolean f98282t;

    /* renamed from: u */
    private Short f98283u;

    /* renamed from: v */
    private Short f98284v;

    /* renamed from: w */
    private Short f98285w;

    /* renamed from: x */
    private Boolean f98286x;

    /* renamed from: y */
    private Boolean f98287y;

    /* renamed from: z */
    private Integer f98288z;

    /* renamed from: A */
    public final void mo54222A(boolean z) {
        this.f98286x = Boolean.valueOf(z);
    }

    /* renamed from: B */
    public final void mo54223B(boolean z) {
        this.f98239H = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final ayqk mo54224a() {
        String str = this.f98265c == null ? " gattOperationTimeoutSeconds" : "";
        if (this.f98266d == null) {
            str = str.concat(" gattConnectionTimeoutSeconds");
        }
        if (this.f98267e == null) {
            str = String.valueOf(str).concat(" bluetoothToggleTimeoutSeconds");
        }
        if (this.f98268f == null) {
            str = String.valueOf(str).concat(" bluetoothToggleSleepSeconds");
        }
        if (this.f98269g == null) {
            str = String.valueOf(str).concat(" classicDiscoveryTimeoutSeconds");
        }
        if (this.f98270h == null) {
            str = String.valueOf(str).concat(" numDiscoverAttempts");
        }
        if (this.f98271i == null) {
            str = String.valueOf(str).concat(" discoveryRetrySleepSeconds");
        }
        if (this.f98272j == null) {
            str = String.valueOf(str).concat(" ignoreDiscoveryError");
        }
        if (this.f98273k == null) {
            str = String.valueOf(str).concat(" sdpTimeoutSeconds");
        }
        if (this.f98274l == null) {
            str = String.valueOf(str).concat(" numSdpAttempts");
        }
        if (this.f98275m == null) {
            str = String.valueOf(str).concat(" numCreateBondAttempts");
        }
        if (this.f98276n == null) {
            str = String.valueOf(str).concat(" numConnectAttempts");
        }
        if (this.f98277o == null) {
            str = String.valueOf(str).concat(" numWriteAccountKeyAttempts");
        }
        if (this.f98278p == null) {
            str = String.valueOf(str).concat(" toggleBluetoothOnFailure");
        }
        if (this.f98279q == null) {
            str = String.valueOf(str).concat(" bluetoothStateUsesPolling");
        }
        if (this.f98280r == null) {
            str = String.valueOf(str).concat(" bluetoothStatePollingMillis");
        }
        if (this.f98281s == null) {
            str = String.valueOf(str).concat(" numAttempts");
        }
        if (this.f98282t == null) {
            str = String.valueOf(str).concat(" enableBrEdrHandover");
        }
        if (this.f98283u == null) {
            str = String.valueOf(str).concat(" brHandoverDataCharacteristicId");
        }
        if (this.f98284v == null) {
            str = String.valueOf(str).concat(" bluetoothSigDataCharacteristicId");
        }
        if (this.f98258a == null) {
            str = String.valueOf(str).concat(" firmwareVersionCharacteristicId");
        }
        if (this.f98285w == null) {
            str = String.valueOf(str).concat(" brTransportBlockDataDescriptorId");
        }
        if (this.f98286x == null) {
            str = String.valueOf(str).concat(" waitForUuidsAfterBonding");
        }
        if (this.f98287y == null) {
            str = String.valueOf(str).concat(" receiveUuidsAndBondedEventBeforeClose");
        }
        if (this.f98288z == null) {
            str = String.valueOf(str).concat(" removeBondTimeoutSeconds");
        }
        if (this.f98232A == null) {
            str = String.valueOf(str).concat(" removeBondSleepMillis");
        }
        if (this.f98233B == null) {
            str = String.valueOf(str).concat(" createBondTimeoutSeconds");
        }
        if (this.f98234C == null) {
            str = String.valueOf(str).concat(" hidCreateBondTimeoutSeconds");
        }
        if (this.f98235D == null) {
            str = String.valueOf(str).concat(" proxyTimeoutSeconds");
        }
        if (this.f98236E == null) {
            str = String.valueOf(str).concat(" rejectPhonebookAccess");
        }
        if (this.f98237F == null) {
            str = String.valueOf(str).concat(" rejectMessageAccess");
        }
        if (this.f98238G == null) {
            str = String.valueOf(str).concat(" rejectSimAccess");
        }
        if (this.f98239H == null) {
            str = String.valueOf(str).concat(" writeSharedSecretKey");
        }
        if (this.f98240I == null) {
            str = String.valueOf(str).concat(" writeAccountKeySleepMillis");
        }
        if (this.f98241J == null) {
            str = String.valueOf(str).concat(" skipDisconnectingGattBeforeWritingAccountKey");
        }
        if (this.f98242K == null) {
            str = String.valueOf(str).concat(" skipDiscoveryBeforeCreateBondForOlderThanOreo");
        }
        if (this.f98243L == null) {
            str = String.valueOf(str).concat(" acceptPasskey");
        }
        if (this.f98264b == null) {
            str = String.valueOf(str).concat(" supportedProfileUuids");
        }
        if (this.f98244M == null) {
            str = String.valueOf(str).concat(" providerInitiatesBondingIfSupported");
        }
        if (this.f98245N == null) {
            str = String.valueOf(str).concat(" attemptDirectConnectionWhenPreviouslyBonded");
        }
        if (this.f98246O == null) {
            str = String.valueOf(str).concat(" automaticallyReconnectGattWhenNeeded");
        }
        if (this.f98247P == null) {
            str = String.valueOf(str).concat(" skipConnectingProfiles");
        }
        if (this.f98248Q == null) {
            str = String.valueOf(str).concat(" ignoreUuidTimeoutAfterBonded");
        }
        if (this.f98249R == null) {
            str = String.valueOf(str).concat(" specifyCreateBondTransportType");
        }
        if (this.f98250S == null) {
            str = String.valueOf(str).concat(" createBondTransportType");
        }
        if (this.f98251T == null) {
            str = String.valueOf(str).concat(" increaseIntentFilterPriority");
        }
        if (this.f98252U == null) {
            str = String.valueOf(str).concat(" evaluatePerformance");
        }
        if (this.f98253V == null) {
            str = String.valueOf(str).concat(" enableNamingCharacteristic");
        }
        if (this.f98254W == null) {
            str = String.valueOf(str).concat(" enableFirmwareVersionCharacteristic");
        }
        if (this.f98255X == null) {
            str = String.valueOf(str).concat(" keepSameAccountKeyWrite");
        }
        if (this.f98256Y == null) {
            str = String.valueOf(str).concat(" enableDesktopExperimental");
        }
        if (this.f98257Z == null) {
            str = String.valueOf(str).concat(" isRetroactivePairing");
        }
        if (this.f98259aa == null) {
            str = String.valueOf(str).concat(" numSdpAttemptsAfterBonded");
        }
        if (this.f98260ab == null) {
            str = String.valueOf(str).concat(" supportHidDevice");
        }
        if (this.f98261ac == null) {
            str = String.valueOf(str).concat(" enablePairingWhileDirectlyConnecting");
        }
        if (this.f98262ad == null) {
            str = String.valueOf(str).concat(" acceptConsentForFastPairOne");
        }
        if (this.f98263ae == null) {
            str = String.valueOf(str).concat(" gattConnectRetryTimeoutMillis");
        }
        if (str.isEmpty()) {
            return new ayni(this.f98265c.intValue(), this.f98266d.intValue(), this.f98267e.intValue(), this.f98268f.intValue(), this.f98269g.intValue(), this.f98270h.intValue(), this.f98271i.intValue(), this.f98272j.booleanValue(), this.f98273k.intValue(), this.f98274l.intValue(), this.f98275m.intValue(), this.f98276n.intValue(), this.f98277o.intValue(), this.f98278p.booleanValue(), this.f98279q.booleanValue(), this.f98280r.intValue(), this.f98281s.intValue(), this.f98282t.booleanValue(), this.f98283u.shortValue(), this.f98284v.shortValue(), this.f98258a.shortValue(), this.f98285w.shortValue(), this.f98286x.booleanValue(), this.f98287y.booleanValue(), this.f98288z.intValue(), this.f98232A.intValue(), this.f98233B.intValue(), this.f98234C.intValue(), this.f98235D.intValue(), this.f98236E.booleanValue(), this.f98237F.booleanValue(), this.f98238G.booleanValue(), this.f98239H.booleanValue(), this.f98240I.intValue(), this.f98241J.booleanValue(), this.f98242K.booleanValue(), this.f98243L.booleanValue(), this.f98264b, this.f98244M.booleanValue(), this.f98245N.booleanValue(), this.f98246O.booleanValue(), this.f98247P.booleanValue(), this.f98248Q.booleanValue(), this.f98249R.booleanValue(), this.f98250S.intValue(), this.f98251T.booleanValue(), this.f98252U.booleanValue(), this.f98253V.booleanValue(), this.f98254W.booleanValue(), this.f98255X.booleanValue(), this.f98256Y.booleanValue(), this.f98257Z.booleanValue(), this.f98259aa.intValue(), this.f98260ab.booleanValue(), this.f98261ac.booleanValue(), this.f98262ad.booleanValue(), this.f98263ae.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo54228b() {
        this.f98251T = true;
    }

    /* renamed from: c */
    public final void mo54232c(int i) {
        this.f98267e = Integer.valueOf(i);
    }

    /* renamed from: d */
    public final void mo54235d(int i) {
        this.f98269g = Integer.valueOf(i);
    }

    /* renamed from: e */
    public final void mo54237e(int i) {
        this.f98233B = Integer.valueOf(i);
    }

    /* renamed from: f */
    public final void mo54239f(int i) {
        this.f98250S = Integer.valueOf(i);
    }

    /* renamed from: g */
    public final void mo54241g(int i) {
        this.f98271i = Integer.valueOf(i);
    }

    /* renamed from: h */
    public final void mo54243h(int i) {
        this.f98263ae = Integer.valueOf(i);
    }

    /* renamed from: i */
    public final void mo54245i(int i) {
        this.f98266d = Integer.valueOf(i);
    }

    /* renamed from: j */
    public final void mo54247j(int i) {
        this.f98265c = Integer.valueOf(i);
    }

    /* renamed from: k */
    public final void mo54249k(int i) {
        this.f98234C = Integer.valueOf(i);
    }

    /* renamed from: l */
    public final void mo54251l(int i) {
        this.f98281s = Integer.valueOf(i);
    }

    /* renamed from: m */
    public final void mo54253m(int i) {
        this.f98276n = Integer.valueOf(i);
    }

    /* renamed from: n */
    public final void mo54255n(int i) {
        this.f98275m = Integer.valueOf(i);
    }

    /* renamed from: o */
    public final void mo54257o(int i) {
        this.f98270h = Integer.valueOf(i);
    }

    /* renamed from: p */
    public final void mo54259p(int i) {
        this.f98274l = Integer.valueOf(i);
    }

    /* renamed from: q */
    public final void mo54261q(int i) {
        this.f98259aa = Integer.valueOf(i);
    }

    /* renamed from: r */
    public final void mo54263r(int i) {
        this.f98277o = Integer.valueOf(i);
    }

    /* renamed from: s */
    public final void mo54265s(int i) {
        this.f98235D = Integer.valueOf(i);
    }

    /* renamed from: t */
    public final void mo54267t(int i) {
        this.f98232A = Integer.valueOf(i);
    }

    /* renamed from: u */
    public final void mo54269u(int i) {
        this.f98288z = Integer.valueOf(i);
    }

    /* renamed from: v */
    public final void mo54271v(int i) {
        this.f98273k = Integer.valueOf(i);
    }

    /* renamed from: w */
    public final void mo54273w(int i) {
        this.f98240I = Integer.valueOf(i);
    }

    /* renamed from: x */
    public final void mo54275x(boolean z) {
        this.f98249R = Boolean.valueOf(z);
    }

    /* renamed from: y */
    public final void mo54276y(boolean z) {
        this.f98260ab = Boolean.valueOf(z);
    }

    /* renamed from: z */
    public final void mo54277z(boolean z) {
        this.f98278p = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void mo54229b(int i) {
        this.f98268f = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo54233c(short s) {
        this.f98285w = Short.valueOf(s);
    }

    /* renamed from: d */
    public final void mo54236d(boolean z) {
        this.f98246O = Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final void mo54238e(boolean z) {
        this.f98279q = Boolean.valueOf(z);
    }

    /* renamed from: f */
    public final void mo54240f(boolean z) {
        this.f98282t = Boolean.valueOf(z);
    }

    /* renamed from: g */
    public final void mo54242g(boolean z) {
        this.f98256Y = Boolean.valueOf(z);
    }

    /* renamed from: h */
    public final void mo54244h(boolean z) {
        this.f98254W = Boolean.valueOf(z);
    }

    /* renamed from: i */
    public final void mo54246i(boolean z) {
        this.f98253V = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public final void mo54248j(boolean z) {
        this.f98261ac = Boolean.valueOf(z);
    }

    /* renamed from: k */
    public final void mo54250k(boolean z) {
        this.f98252U = Boolean.valueOf(z);
    }

    /* renamed from: l */
    public final void mo54252l(boolean z) {
        this.f98272j = Boolean.valueOf(z);
    }

    /* renamed from: m */
    public final void mo54254m(boolean z) {
        this.f98248Q = Boolean.valueOf(z);
    }

    /* renamed from: n */
    public final void mo54256n(boolean z) {
        this.f98257Z = Boolean.valueOf(z);
    }

    /* renamed from: o */
    public final void mo54258o(boolean z) {
        this.f98255X = Boolean.valueOf(z);
    }

    /* renamed from: p */
    public final void mo54260p(boolean z) {
        this.f98244M = Boolean.valueOf(z);
    }

    /* renamed from: q */
    public final void mo54262q(boolean z) {
        this.f98287y = Boolean.valueOf(z);
    }

    /* renamed from: r */
    public final void mo54264r(boolean z) {
        this.f98237F = Boolean.valueOf(z);
    }

    /* renamed from: s */
    public final void mo54266s(boolean z) {
        this.f98236E = Boolean.valueOf(z);
    }

    /* renamed from: t */
    public final void mo54268t(boolean z) {
        this.f98238G = Boolean.valueOf(z);
    }

    /* renamed from: u */
    public final void mo54270u(boolean z) {
        this.f98247P = Boolean.valueOf(z);
    }

    /* renamed from: v */
    public final void mo54272v(boolean z) {
        this.f98241J = Boolean.valueOf(z);
    }

    /* renamed from: w */
    public final void mo54274w(boolean z) {
        this.f98242K = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void mo54230b(short s) {
        this.f98283u = Short.valueOf(s);
    }

    /* renamed from: c */
    public final void mo54234c(boolean z) {
        this.f98245N = Boolean.valueOf(z);
    }

    /* renamed from: b */
    public final void mo54231b(boolean z) {
        this.f98243L = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo54225a(int i) {
        this.f98280r = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo54226a(short s) {
        this.f98284v = Short.valueOf(s);
    }

    /* renamed from: a */
    public final void mo54227a(boolean z) {
        this.f98262ad = Boolean.valueOf(z);
    }
}
