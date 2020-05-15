package p000;

import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import android.telecom.PhoneAccountHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: nid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nid {

    /* renamed from: a */
    public final Call f35688a;

    /* renamed from: b */
    public nib f35689b;

    /* renamed from: c */
    private final Call.Listener f35690c = new nic(this);

    private nid(Call call) {
        this.f35688a = call;
    }

    /* renamed from: a */
    static List m26369a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m26370a((Call) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final GatewayInfo mo20726b() {
        return this.f35688a.getDetails().getGatewayInfo();
    }

    /* renamed from: c */
    public final Uri mo20728c() {
        return this.f35688a.getDetails().getHandle();
    }

    /* renamed from: d */
    public final long mo20729d() {
        return this.f35688a.getDetails().getConnectTimeMillis();
    }

    /* renamed from: e */
    public final String mo20730e() {
        return this.f35688a.getDetails().getCallerDisplayName();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nid) {
            return this.f35688a.equals(((nid) obj).f35688a);
        }
        return false;
    }

    /* renamed from: f */
    public final int mo20732f() {
        return this.f35688a.getDetails().getCallCapabilities();
    }

    /* renamed from: g */
    public final PhoneAccountHandle mo20733g() {
        return this.f35688a.getDetails().getAccountHandle();
    }

    /* renamed from: h */
    public final int mo20734h() {
        return this.f35688a.getDetails().getCallProperties();
    }

    public final int hashCode() {
        return this.f35688a.hashCode();
    }

    /* renamed from: i */
    public final Bundle mo20736i() {
        return this.f35688a.getDetails().getExtras();
    }

    /* renamed from: j */
    public final Bundle mo20737j() {
        return this.f35688a.getDetails().getIntentExtras();
    }

    /* renamed from: k */
    public final int mo20738k() {
        return this.f35688a.getDetails().getVideoState();
    }

    /* renamed from: l */
    public final List mo20739l() {
        return this.f35688a.getCannedTextResponses();
    }

    /* renamed from: m */
    public final String mo20740m() {
        return this.f35688a.getRemainingPostDialSequence();
    }

    /* renamed from: n */
    public final int mo20741n() {
        return this.f35688a.getState();
    }

    /* renamed from: o */
    public final boolean mo20742o() {
        return !this.f35688a.getChildren().isEmpty();
    }

    /* renamed from: p */
    public final nid mo20743p() {
        return m26370a(this.f35688a.getParent());
    }

    /* renamed from: a */
    public static nid m26370a(Call call) {
        if (call != null) {
            return new nid(call);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo20727b(nib nib) {
        nib nib2 = this.f35689b;
        if (nib2 == null || nib == nib2) {
            this.f35689b = null;
            this.f35688a.removeListener(this.f35690c);
            return;
        }
        throw new IllegalStateException("Wrong listener");
    }

    /* renamed from: a */
    public final DisconnectCause mo20724a() {
        return this.f35688a.getDetails().getDisconnectCause();
    }

    /* renamed from: a */
    public final void mo20725a(nib nib) {
        if (this.f35689b == null) {
            this.f35689b = nib;
            this.f35688a.addListener(this.f35690c);
            return;
        }
        throw new IllegalStateException("Non-null listener");
    }
}
