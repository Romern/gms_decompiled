package p000;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubClientCallback;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppMessage;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: bflv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bflv extends ContextHubClientCallback {

    /* renamed from: a */
    public final ContextHubManager f114373a;

    /* renamed from: b */
    public final bqgj f114374b;

    /* renamed from: c */
    public boolean f114375c = false;

    /* renamed from: d */
    public bflt f114376d;

    /* renamed from: e */
    public ContextHubClient f114377e;

    public bflv(ContextHubManager contextHubManager, bqgj bqgj) {
        this.f114373a = contextHubManager;
        this.f114374b = bqgj;
    }

    /* renamed from: a */
    public final void mo61898a() {
        this.f114374b.execute(new bflr(this));
    }

    public final void onHubReset(ContextHubClient contextHubClient) {
        this.f114373a.queryNanoApps(this.f114377e.getAttachedHub()).setOnCompleteListener(new bfls(this), this.f114374b);
    }

    public final void onMessageFromNanoApp(ContextHubClient contextHubClient, NanoAppMessage nanoAppMessage) {
        int i;
        bpna bpna;
        bflt bflt = this.f114376d;
        if (nanoAppMessage.getMessageType() == 2147478647) {
            bflg bflg = (bflg) bflt;
            if (bflg.f114338e.contains(Long.valueOf(nanoAppMessage.getNanoAppId())) && nanoAppMessage.getMessageBody() != null) {
                byte[] messageBody = nanoAppMessage.getMessageBody();
                int i2 = 0;
                while (true) {
                    int length = messageBody.length;
                    if (i2 < length) {
                        int i3 = i2 + 2;
                        short s = length >= i3 ? ByteBuffer.wrap(messageBody, i2, 2).order(ByteOrder.LITTLE_ENDIAN).getShort() : -1;
                        if (s > 0 && length >= (i = i3 + s)) {
                            try {
                                bpna = (bpna) bxvk.m124012a(bpna.f138380a, ByteBuffer.wrap(messageBody, i3, s));
                            } catch (bxwf e) {
                                bpna = null;
                            }
                            if (bpna != null) {
                                bxvd da = bonq.f133833p.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bonq bonq = (bonq) da.f164949b;
                                bonq.f133836b = 12;
                                int i4 = bonq.f133835a | 1;
                                bonq.f133835a = i4;
                                bpna.getClass();
                                bonq.f133847m = bpna;
                                bonq.f133835a = i4 | 4096;
                                bonq bonq2 = (bonq) da.mo74062i();
                                qws qws = bflg.f114337d;
                                if (qws != null) {
                                    qws.mo24333a(bonq2).mo24327b();
                                }
                                i2 = i;
                            } else if (Log.isLoggable("NanoAppLogging", 6)) {
                                long nanoAppId = nanoAppMessage.getNanoAppId();
                                StringBuilder sb = new StringBuilder(76);
                                sb.append("Failed to decode log message from ID: ");
                                sb.append(nanoAppId);
                                sb.append(" Aborting parsing.");
                                Log.e("NanoAppLogging", sb.toString());
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void onNanoAppEnabled(ContextHubClient contextHubClient, long j) {
        this.f114376d.mo61876a(j);
    }

    public final void onNanoAppLoaded(ContextHubClient contextHubClient, long j) {
        this.f114376d.mo61876a(j);
    }

    /* renamed from: a */
    public final void mo61899a(bflt bflt, Set set) {
        ContextHubManager contextHubManager;
        if (bflt == null) {
            return;
        }
        if (set.isEmpty() || (contextHubManager = this.f114373a) == null) {
            bflt.mo61877a(false);
            return;
        }
        bflt bflt2 = this.f114376d;
        if (bflt2 == null) {
            this.f114375c = true;
            this.f114376d = bflt;
            List<ContextHubInfo> contextHubs = contextHubManager.getContextHubs();
            ArrayList arrayList = new ArrayList(contextHubs);
            for (ContextHubInfo contextHubInfo : contextHubs) {
                this.f114373a.queryNanoApps(contextHubInfo).setOnCompleteListener(new bflu(this, contextHubInfo, arrayList, set), this.f114374b);
            }
            return;
        }
        bflt2.mo61877a(true);
    }
}
