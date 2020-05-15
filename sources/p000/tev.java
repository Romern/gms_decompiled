package p000;

/* renamed from: tev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tev {

    /* renamed from: a */
    private static final Logger f45802a = tea.m36798a("verification factory");

    /* renamed from: b */
    private final sza f45803b;

    public tev(sza sza) {
        this.f45803b = sza;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final teu mo26451a(tdx tdx, cbqy cbqy, tes tes, teg teg) {
        cbqg cbqg;
        char c;
        tdx tdx2 = tdx;
        cbqy cbqy2 = cbqy;
        Logger Logger = f45802a;
        String valueOf = String.valueOf(cbqy);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("get verifier for verification ");
        sb.append(valueOf);
        Logger.logVerbose(sb.toString(), new Object[0]);
        try {
            tdz.m36796a();
            if (tdz.m36797a(cbqy)) {
                cbob cbob = cbob.UNKNOWN;
                if (cbqy2.f178083a == 4) {
                    cbqg = (cbqg) cbqy2.f178084b;
                } else {
                    cbqg = cbqg.f178018b;
                }
                cbnz cbnz = cbqg.f178020a;
                if (cbnz == null) {
                    cbnz = cbnz.f177781f;
                }
                cbob a = cbob.m128036a(cbnz.f177786d);
                if (a == null) {
                    a = cbob.UNRECOGNIZED;
                }
                int ordinal = a.ordinal();
                String str = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 5 ? ordinal != 6 ? "unknown" : "flash_call_verifier" : "registered_sms" : "carrier_id" : "inbound_message_verifier" : "outbound_message_verifier";
                switch (str.hashCode()) {
                    case -1413825144:
                        if (str.equals("flash_call_verifier")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -506192515:
                        if (str.equals("outbound_message_verifier")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 18938396:
                        if (str.equals("registered_sms")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 61239316:
                        if (str.equals("inbound_message_verifier")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 806522818:
                        if (str.equals("carrier_id")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    f45802a.mo25414c("Doing MT verification", new Object[0]);
                    return new teo(cbqy2, this.f45803b, tdx2, tes);
                } else if (c == 1) {
                    f45802a.mo25414c("Doing MO verification", new Object[0]);
                    return new tel(cbqy2, this.f45803b, tdx2);
                } else if (c == 2) {
                    f45802a.mo25414c("Doing Carrier ID verification", new Object[0]);
                    return new tee(cbqy2, this.f45803b, tdx2);
                } else if (c == 3) {
                    f45802a.mo25414c("Doing Registered SMS verification", new Object[0]);
                    return new teq(cbqy2, this.f45803b, tdx2);
                } else if (c == 4) {
                    f45802a.mo25414c("Doing Flash Call verification", new Object[0]);
                    return new tej(cbqy2, this.f45803b, tdx2, teg);
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                f45802a.mo25418e("Not a pending verification.", new Object[0]);
                throw new tdw("Not a pending verification", 39, false);
            }
        } catch (tdw e) {
            throw new IllegalArgumentException(e);
        }
    }
}
