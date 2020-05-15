package p000;

/* renamed from: bgln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgln extends bmxe {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12636a(Object obj) {
        btxv btxv = (btxv) obj;
        throw new UnsupportedOperationException("converting from ActivityRecognitionProto to CHRE ActivityResultDiagnostics is not supported!");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12637b(Object obj) {
        bubz bubz = (bubz) obj;
        bxvd da = btxv.f152863d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btxv btxv = (btxv) da.f164949b;
        btxv.f152866b = 2;
        btxv.f152865a |= 1;
        bxwc bxwc = bubz.f153310a;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            bucn bucn = (bucn) bxwc.get(i);
            bxvd da2 = btyb.f152871g.mo74144da();
            int a = bucg.m119322a(bucn.f153386c);
            if (a == 0) {
                a = 1;
            }
            int a2 = btxy.m118999a(a - 1);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btyb btyb = (btyb) da2.f164949b;
            int i2 = a2 - 1;
            if (a2 != 0) {
                btyb.f152877e = i2;
                btyb.f152873a |= 8;
                int a3 = bucm.m119328a(bucn.f153384a);
                if (a3 == 0) {
                    a3 = 1;
                }
                int a4 = btya.m119001a(a3 - 1);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                btyb btyb2 = (btyb) da2.f164949b;
                int i3 = a4 - 1;
                if (a4 != 0) {
                    btyb2.f152874b = i3;
                    btyb2.f152873a |= 1;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btyb btyb3 = (btyb) da2.f164949b;
                    int i4 = btyb3.f152873a | 4;
                    btyb3.f152873a = i4;
                    btyb3.f152876d = currentTimeMillis;
                    long j = bucn.f153385b;
                    btyb3.f152873a = i4 | 2;
                    btyb3.f152875c = j;
                    bxvd da3 = btyd.f152884d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    btyd btyd = (btyd) da3.f164949b;
                    btyd.f152886a |= 2;
                    btyd.f152887b = 100.0f;
                    buce a5 = buce.m119318a(bucn.f153387d);
                    if (a5 == null) {
                        a5 = buce.INVALID_ACTIVITY;
                    }
                    Integer a6 = bglg.m99239a(a5);
                    if (a6 != null) {
                        int intValue = a6.intValue();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        btyd btyd2 = (btyd) da3.f164949b;
                        btyd2.f152886a |= 4;
                        btyd2.f152888c = intValue;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    btyb btyb4 = (btyb) da2.f164949b;
                    btyd btyd3 = (btyd) da3.mo74062i();
                    btyd3.getClass();
                    btyb4.f152878f = btyd3;
                    btyb4.f152873a |= 16;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    btxv btxv2 = (btxv) da.f164949b;
                    btyb btyb5 = (btyb) da2.mo74062i();
                    btyb5.getClass();
                    if (!btxv2.f152867c.mo73666a()) {
                        btxv2.f152867c = GeneratedMessageLite.m124021a(btxv2.f152867c);
                    }
                    btxv2.f152867c.add(btyb5);
                    i++;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        String valueOf = String.valueOf(da);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("ActivityResultDiagnostics = ");
        sb.append(valueOf);
        sb.toString();
        return (btxv) da.mo74062i();
    }
}
