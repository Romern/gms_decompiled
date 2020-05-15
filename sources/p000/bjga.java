package p000;

/* renamed from: bjga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjga implements bjex {

    /* renamed from: a */
    private static final bnic f122636a = bnic.m109491a("EcdhKeyCalculationAction", "EncryptionAction", "P256KeyPairGenerationAction");

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* renamed from: a */
    public final bjfd mo52450a(bjfc bjfc) {
        char c;
        bjew bjew;
        String a = bjfc.mo65078a();
        int hashCode = a.hashCode();
        if (hashCode != 680715748) {
            if (hashCode != 1855534754) {
                if (hashCode == 2050543545 && a.equals("EncryptionAction")) {
                    c = 1;
                    if (c != 0) {
                        bjew = new bjfo();
                    } else if (c == 1) {
                        bjew = new bjfp();
                    } else if (c != 2) {
                        bjew = null;
                    } else {
                        bjew = new bjft();
                    }
                    if (bjew != null) {
                        return new bjfd(bjfd.m103295a(2));
                    }
                    return bjew.mo52455a(bjfc);
                }
            } else if (a.equals("EcdhKeyCalculationAction")) {
                c = 0;
                if (c != 0) {
                }
                if (bjew != null) {
                }
            }
        } else if (a.equals("P256KeyPairGenerationAction")) {
            c = 2;
            if (c != 0) {
            }
            if (bjew != null) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
        if (bjew != null) {
        }
    }

    /* renamed from: b */
    public final boolean mo52451b(bjfc bjfc) {
        return f122636a.contains(bjfc.mo65078a());
    }
}
