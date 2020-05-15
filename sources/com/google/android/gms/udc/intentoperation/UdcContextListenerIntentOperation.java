package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.util.SparseIntArray;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.contextmanager.ContextData;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UdcContextListenerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f109378a = srn.m36124a();

    /* renamed from: a */
    private static Account m93657a(Intent intent) {
        String stringExtra = intent.getStringExtra("UdcAccountName");
        if (!stm.m36302d(stringExtra)) {
            return new Account(stringExtra, "com.google");
        }
        bnsl bnsl = (bnsl) f109378a.mo68388c();
        bnsl.mo68432a("com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Account missing");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r12 = p000.avja.m78602a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        r6.mo12460c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r8 = (p000.bnsl) p000.avcr.f92976a.mo68388c();
        r8.mo68437a(r12);
        r8.mo68432a("avcr", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r8.mo68405a("Couldn't parse Context");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015b, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:31:0x0080, B:41:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
    public final void onHandleIntent(Intent intent) {
        Account account;
        bxlw bxlw;
        if (intent != null && chbh.m148004b()) {
            if (chbh.m148011i() || chbh.m148012j() || !sre.m36079a()) {
                String stringExtra = intent.getStringExtra("UdcAccountName");
                tir tir = null;
                SparseIntArray sparseIntArray = null;
                if (stm.m36302d(stringExtra)) {
                    bnsl bnsl = (bnsl) f109378a.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Account missing");
                    account = null;
                } else {
                    account = new Account(stringExtra, "com.google");
                }
                if (account != null) {
                    int[] iArr = ContextData.f30618a;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("context_data_byte_array");
                    ContextData contextData = byteArrayExtra != null ? new ContextData(byteArrayExtra) : null;
                    if (contextData != null) {
                        srn srn = avcr.f92976a;
                        if (chbh.m148015m()) {
                            String d = contextData.mo18014d();
                            try {
                                bxlw a = avja.m78602a(contextData);
                                String str = account.name;
                                try {
                                    tir a2 = new avja(this, account).mo51287a();
                                    if (a2 == null) {
                                        bnsl bnsl2 = (bnsl) avcr.f92976a.mo68388c();
                                        bnsl2.mo68432a("avcr", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("No buffers returned returned by ContextManager.");
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
                                            sbv.m34875a(this, account.name, sqc.m35960a(b));
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
                                bnsl bnsl3 = (bnsl) avcr.f92976a.mo68387b();
                                bnsl3.mo68437a(e);
                                bnsl3.mo68432a("avcr", "a", 41, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl3.mo68405a("Couldn't parse context");
                            }
                        }
                    }
                }
            }
        }
    }
}
