package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ahjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahjr extends rzu {

    /* renamed from: i */
    public static final /* synthetic */ int f67291i = 0;

    /* renamed from: a */
    public final ahki f67292a;

    /* renamed from: b */
    public final ahkx f67293b = new ahkx();

    /* renamed from: h */
    public final Map f67294h = new ConcurrentHashMap();

    /* renamed from: j */
    private final ahfx f67295j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahjr(Context context) {
        super(context, 54, new int[0]);
        ahfx ahfx = new ahfx(2, ahjp.f67288a);
        this.f67295j = ahfx;
        this.f67292a = new ahki(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.emptySet();
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        for (Map.Entry entry : this.f67294h.entrySet()) {
            printWriter.write(String.format("%s\n", entry.getKey()));
            ((ahjo) entry.getValue()).dump(fileDescriptor, printWriter, strArr);
            printWriter.write("\n");
        }
        this.f67292a.f67338a.mo36763a(printWriter);
        printWriter.flush();
    }

    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        Long l;
        String str;
        String str2 = getServiceRequest.f30230d;
        Bundle bundle = getServiceRequest.f30233g;
        if (bundle != null) {
            Long valueOf = Long.valueOf(bundle.getLong("clientId", -1));
            str = bundle.getString("zeroPartyIdentifier", null);
            l = valueOf;
        } else {
            str = null;
            l = null;
        }
        ahjo ahjo = new ahjo(this.f43904d, str2, str, l, this.f67293b, this.f67292a, this.f67295j, new ahjq(this, str2));
        this.f67294h.put(str2, ahjo);
        qxq qxq = this.f67295j.f67130b;
        if (qxq != null) {
            qxq.mo24385d("NearbyConnectionsConnectionStatus").mo24367a(0);
        }
        sbj.mo16678a(0, ahjo, (Bundle) null);
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahjr", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68425a("Client %s with package name %s and sdk version %s has connected.", l, str2, Integer.valueOf(getServiceRequest.f30229c));
    }
}
