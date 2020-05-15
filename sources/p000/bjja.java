package p000;

/* renamed from: bjja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjja {
    /* renamed from: a */
    public static void m103638a(long j, String str, bpsi bpsi) {
        bxvd da = bpsk.f138966h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk = (bpsk) da.f164949b;
        bpsk.f138968a |= 1;
        bpsk.f138971d = j;
        bpsg bpsg = bpsg.EVENT_TYPE_API_REQUEST_START;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk2 = (bpsk) da.f164949b;
        bpsk2.f138972e = bpsg.f138957l;
        bpsk2.f138968a |= 2;
        bpsi.getClass();
        bpsk2.f138970c = bpsi;
        bpsk2.f138969b = 5;
        bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), str);
    }

    /* renamed from: a */
    public static void m103639a(long j, String str, bpsi bpsi, int i) {
        bxvd da = bpsk.f138966h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk = (bpsk) da.f164949b;
        bpsk.f138968a |= 1;
        bpsk.f138971d = j;
        bpsg bpsg = bpsg.EVENT_TYPE_API_REQUEST_END;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpsk bpsk2 = (bpsk) da.f164949b;
        bpsk2.f138972e = bpsg.f138957l;
        int i2 = bpsk2.f138968a | 2;
        bpsk2.f138968a = i2;
        bpsi.getClass();
        bpsk2.f138970c = bpsi;
        bpsk2.f138969b = 5;
        bpsk2.f138974g = i - 1;
        bpsk2.f138968a = i2 | 16;
        bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), str);
    }
}
