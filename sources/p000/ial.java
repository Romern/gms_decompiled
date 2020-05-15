package p000;

import android.content.Context;
import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: ial */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ial extends aaab {

    /* renamed from: a */
    private final qws f20638a;

    /* renamed from: b */
    private final SmsRetrieverEvent f20639b;

    public ial(qws qws, SmsRetrieverEvent smsRetrieverEvent) {
        super(197, "MetricsEventLoggingOperation");
        bmxy.m108581a(qws);
        this.f20638a = qws;
        bmxy.m108581a(smsRetrieverEvent);
        this.f20639b = smsRetrieverEvent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        String str2;
        String str3;
        if (cceb.m129360d() && sqo.m35984a(context)) {
            SmsRetrieverEvent smsRetrieverEvent = this.f20639b;
            bxvd da = boge.f132963m.mo74144da();
            if ((smsRetrieverEvent.f10276l & 1) != 0) {
                int a = bogd.m111168a(smsRetrieverEvent.f10265a);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge = (boge) da.f164949b;
                int i = a - 1;
                if (a != 0) {
                    boge.f132966b = i;
                    boge.f132965a |= 1;
                } else {
                    throw null;
                }
            }
            if (!((smsRetrieverEvent.f10276l & 2) == 0 || (str3 = smsRetrieverEvent.f10266b) == null)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge2 = (boge) da.f164949b;
                str3.getClass();
                boge2.f132965a |= 2;
                boge2.f132967c = str3;
            }
            if ((smsRetrieverEvent.f10276l & 4) != 0) {
                int i2 = smsRetrieverEvent.f10267c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge3 = (boge) da.f164949b;
                boge3.f132965a |= 4;
                boge3.f132968d = i2;
            }
            if ((smsRetrieverEvent.f10276l & 8) != 0) {
                int a2 = bogb.m111166a(smsRetrieverEvent.f10268d);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge4 = (boge) da.f164949b;
                int i3 = a2 - 1;
                if (a2 != 0) {
                    boge4.f132969e = i3;
                    boge4.f132965a |= 8;
                } else {
                    throw null;
                }
            }
            if (!((smsRetrieverEvent.f10276l & 16) == 0 || (str2 = smsRetrieverEvent.f10269e) == null)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge5 = (boge) da.f164949b;
                str2.getClass();
                boge5.f132965a |= 16;
                boge5.f132970f = str2;
            }
            if (!((smsRetrieverEvent.f10276l & 32) == 0 || (str = smsRetrieverEvent.f10270f) == null)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge6 = (boge) da.f164949b;
                str.getClass();
                boge6.f132965a |= 32;
                boge6.f132971g = str;
            }
            if ((smsRetrieverEvent.f10276l & 64) != 0) {
                int i4 = smsRetrieverEvent.f10271g;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge7 = (boge) da.f164949b;
                boge7.f132965a |= 64;
                boge7.f132972h = i4;
            }
            if ((smsRetrieverEvent.f10276l & 128) != 0) {
                int i5 = smsRetrieverEvent.f10272h;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge8 = (boge) da.f164949b;
                boge8.f132965a |= 128;
                boge8.f132973i = i5;
            }
            if ((smsRetrieverEvent.f10276l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                bofz a3 = bofz.m111162a(smsRetrieverEvent.f10273i);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge9 = (boge) da.f164949b;
                boge9.f132974j = a3.f132960d;
                boge9.f132965a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if ((smsRetrieverEvent.f10276l & 512) != 0) {
                bofz a4 = bofz.m111162a(smsRetrieverEvent.f10274j);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge10 = (boge) da.f164949b;
                boge10.f132975k = a4.f132960d;
                boge10.f132965a |= 512;
            }
            if ((smsRetrieverEvent.f10276l & 1024) != 0) {
                boolean z = smsRetrieverEvent.f10275k;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boge boge11 = (boge) da.f164949b;
                boge11.f132965a |= 1024;
                boge11.f132976l = z;
            }
            boge boge12 = (boge) da.mo74062i();
            bxvd da2 = boct.f132600I.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boct boct = (boct) da2.f164949b;
            boct.f132612c = 20;
            int i6 = boct.f132610a | 1;
            boct.f132610a = i6;
            boge12.getClass();
            boct.f132631v = boge12;
            boct.f132610a = 4194304 | i6;
            this.f20638a.mo24333a((boct) da2.mo74062i()).mo24327b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
    }
}
