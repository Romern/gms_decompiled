package p000;

import android.accounts.Account;
import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.contextmanager.ContextData;
import java.util.Set;

/* renamed from: avcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avcr {

    /* renamed from: a */
    public static final srn f92976a = srn.m36124a();

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r7 = p000.avja.m78602a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3 = (p000.bnsl) p000.avcr.f92976a.mo68388c();
        r3.mo68437a(r9);
        r3.mo68432a("avcr", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r3.mo68405a("Couldn't parse Context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r8 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0012, B:16:0x003f] */
    /* renamed from: a */
    private static bxlw m78253a(Context context, Account account, String str) {
        avja avja = new avja(context, account);
        tir tir = null;
        r7 = null;
        bxlw bxlw = null;
        try {
            tir a = avja.mo51287a();
            if (a == null) {
                bnsl bnsl = (bnsl) f92976a.mo68388c();
                bnsl.mo68432a("avcr", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("No buffers returned returned by ContextManager.");
                return null;
            }
            int i = 0;
            while (true) {
                if (i >= a.mo24660a()) {
                    break;
                }
                ContextData c = a.mo25159b(i);
                if (!c.mo18014d().equals(str)) {
                    break;
                }
                i++;
            }
            a.mo12460c();
            return bxlw;
        } catch (Throwable th) {
            th = th;
            if (tir != null) {
                tir.mo12460c();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = p000.avja.m78602a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r4.mo12460c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7 = (p000.bnsl) p000.avcr.f92976a.mo68388c();
        r7.mo68437a(r3);
        r7.mo68432a("avcr", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r7.mo68405a("Couldn't parse Context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0023, B:20:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0103  */
    /* renamed from: a */
    static void m78254a(Context context, Account account, ContextData contextData) {
        bxlw bxlw;
        if (chbh.m148015m()) {
            String d = contextData.mo18014d();
            try {
                bxlw a = avja.m78602a(contextData);
                String str = account.name;
                tir tir = null;
                SparseIntArray sparseIntArray = null;
                try {
                    tir a2 = new avja(context, account).mo51287a();
                    if (a2 == null) {
                        bnsl bnsl = (bnsl) f92976a.mo68388c();
                        bnsl.mo68432a("avcr", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("No buffers returned returned by ContextManager.");
                        bxlw = null;
                    } else {
                        int i = 0;
                        while (true) {
                            if (i >= a2.mo24660a()) {
                                break;
                            }
                            ContextData c = a2.mo25159b(i);
                            if (!c.mo18014d().equals(d)) {
                                break;
                            }
                            i++;
                        }
                        a2.mo12460c();
                        bxlw = null;
                    }
                    if (bxlw != null || chbh.m148011i()) {
                        Set b = sqw.m36045b();
                        if (a.f163905a.size() != 0) {
                            if (bxlw != null) {
                                sparseIntArray = new SparseIntArray();
                                bxwc bxwc = bxlw.f163905a;
                                int size = bxwc.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    bxlv bxlv = (bxlv) bxwc.get(i2);
                                    sparseIntArray.put(bxlv.f163900a, bxlv.f163901b);
                                }
                            }
                            Set a3 = avjj.m78611a();
                            bxwc bxwc2 = a.f163905a;
                            int size2 = bxwc2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                bxlv bxlv2 = (bxlv) bxwc2.get(i3);
                                if ((sparseIntArray == null || sparseIntArray.get(bxlv2.f163900a, 0) != bxlv2.f163901b) && !a3.contains(Integer.valueOf(bxlv2.f163900a))) {
                                    b.add(Integer.valueOf(bxlv2.f163900a));
                                }
                            }
                        }
                        bmxr.m108544a(",").mo66874a((Iterable) b);
                        if (!b.isEmpty()) {
                            sbv.m34875a(context, account.name, sqc.m35960a(b));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (tir != null) {
                        tir.mo12460c();
                    }
                    throw th;
                }
            } catch (bxwf e) {
                bnsl bnsl2 = (bnsl) f92976a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("avcr", "a", 41, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Couldn't parse context");
            }
        }
    }
}
