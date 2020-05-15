package p000;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.service.WearableChimeraService;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: ayja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayja extends axrx implements sjr, ayjm {

    /* renamed from: a */
    public static final String[] f97722a = {"unknown", "s3rpc", "rpc", "nonrpc"};

    /* renamed from: b */
    public final ConcurrentHashMap f97723b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentLinkedQueue f97724c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final PackageManager f97725d;

    /* renamed from: e */
    public final axue f97726e;

    /* renamed from: f */
    public final axxv f97727f;

    /* renamed from: g */
    public final axzm f97728g;

    /* renamed from: h */
    public final axuv f97729h;

    /* renamed from: i */
    public final aydn f97730i;

    /* renamed from: j */
    public final axvr f97731j;

    /* renamed from: k */
    public final ayai f97732k;

    /* renamed from: l */
    public final WearableChimeraService f97733l;

    /* renamed from: m */
    public final TelecomManager f97734m;

    /* renamed from: n */
    public final aybd f97735n;

    /* renamed from: o */
    public final axpc f97736o;

    /* renamed from: p */
    public final bmzi f97737p;

    /* renamed from: q */
    public final bmzi f97738q;

    /* renamed from: r */
    public final axwy f97739r;

    /* renamed from: s */
    public final boolean f97740s;

    /* renamed from: t */
    public final boolean f97741t;

    /* renamed from: u */
    final rfz f97742u;

    /* renamed from: v */
    public final ayfs f97743v;

    /* renamed from: w */
    public final ayfx f97744w;

    /* renamed from: x */
    private final ayfw f97745x;

    /* renamed from: y */
    private final axto f97746y;

    public ayja(PackageManager packageManager, axxv axxv, axzm axzm, axuv axuv, axue axue, ayfw ayfw, aydn aydn, axvr axvr, ayai ayai, TelecomManager telecomManager, aybd aybd, axpc axpc, bmzi bmzi, bmzi bmzi2, WearableChimeraService wearableChimeraService, axwy axwy, rfz rfz, axto axto, boolean z, boolean z2, ayfs ayfs, ayfx ayfx) {
        sdo.m34959a(ayfs);
        this.f97743v = ayfs;
        sdo.m34959a(packageManager);
        this.f97725d = packageManager;
        sdo.m34959a(axxv);
        this.f97727f = axxv;
        sdo.m34959a(axzm);
        this.f97728g = axzm;
        sdo.m34959a(axuv);
        this.f97729h = axuv;
        sdo.m34959a(axue);
        this.f97726e = axue;
        sdo.m34959a(ayfw);
        this.f97745x = ayfw;
        sdo.m34959a(aydn);
        this.f97730i = aydn;
        sdo.m34959a(axvr);
        this.f97731j = axvr;
        sdo.m34959a(ayai);
        this.f97732k = ayai;
        sdo.m34959a(wearableChimeraService);
        this.f97733l = wearableChimeraService;
        this.f97740s = z;
        this.f97741t = z2;
        this.f97739r = axwy;
        sdo.m34959a(rfz);
        this.f97742u = rfz;
        sdo.m34959a(axto);
        this.f97746y = axto;
        sdo.m34959a(ayfx);
        this.f97744w = ayfx;
        this.f97734m = telecomManager;
        this.f97735n = aybd;
        this.f97736o = axpc;
        sdo.m34959a(bmzi);
        this.f97737p = bmzi;
        sdo.m34959a(bmzi2);
        this.f97738q = bmzi2;
        if (Log.isLoggable("WearableService", 3)) {
            String valueOf = String.valueOf(axue);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("WearableServiceStub created for ");
            sb.append(valueOf);
            Log.d("WearableService", sb.toString());
        }
    }

    /* renamed from: b */
    private final void m84049b() {
        if (!ayha.m83999e() || !this.f97746y.mo53534a(this.f97726e.f96378b)) {
            this.f97742u.mo24605a(this.f97726e.f96378b);
        }
    }

    /* renamed from: a */
    public final axzf mo54021a() {
        return this.f97728g.mo53784a();
    }

    /* renamed from: c */
    public final void mo53490c(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("getLocalNode: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayhq(this, "getLocalNode", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: d */
    public final void mo53494d(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("getConnectedNodes: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayhr(this, "getConnectedNodes", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: e */
    public final void mo53496e(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("getStorageInformation: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayhz(this, "getStorageInformation", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: f */
    public final void mo53498f(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("clearStorage: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayia("clearStorage", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: g */
    public final void mo53500g(axrs axrs) {
        m84049b();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                sb.append("endCall: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayib(this, "endCall", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: h */
    public final void mo53501h(axrs axrs) {
        m84049b();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("acceptRingingCall: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayid(this, "acceptRingingCall", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: i */
    public final void mo53502i(axrs axrs) {
        m84049b();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb.append("silenceRinger: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayie(this, "silenceRinger", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: j */
    public final void mo53503j(axrs axrs) {
        m84049b();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("syncWifiCredentials: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayic(this, "syncWifiCredentials", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Deprecated
    /* renamed from: k */
    public final void mo53504k(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getCloudSyncOptInOutDone");
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayhc(this, "getCloudSyncOptInOutDone", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: l */
    public final void mo53505l(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getCloudSyncSetting");
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayhf(this, "getCloudSyncSetting", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: m */
    public final void mo53506m(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "getCloudSyncOptInStatus");
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayhd(this, "getCloudSyncOptInStatus", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Deprecated
    /* renamed from: n */
    public final void mo53507n(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb.append("getConnection: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayhy(this, "getConfig", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Deprecated
    /* renamed from: o */
    public final void mo53508o(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("enableConnection: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayij(this, "enableConnection", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Deprecated
    /* renamed from: p */
    public final void mo53509p(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("disableConnection: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayis(this, "disableConnection", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final String toString() {
        String str = this.f97726e.f96377a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("WearableServiceStub[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo53462a(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
                sb.append("getConfigs: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayiv(this, "getConfigs", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final void mo53481b(axrs axrs) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("getDataItems: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayhj(this, "getDataItems", axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: c */
    public final void mo53491c(axrs axrs, int i) {
        m84049b();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("doAncsNegativeAction: ");
                sb.append(i);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayip(this, "doAncsNegativeAction", axrs, i));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: d */
    public final void mo53495d(axrs axrs, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("WearableService", valueOf.length() == 0 ? new String("addLocalCapability: ") : "addLocalCapability: ".concat(valueOf));
            }
            ayfw ayfw = this.f97745x;
            ayiy ayiy = new ayiy(3, this);
            String valueOf2 = String.valueOf(str);
            ayfw.mo53994a(ayiy, new ayhu(this, valueOf2.length() == 0 ? new String("addLocalCapability:") : "addLocalCapability:".concat(valueOf2), str, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: e */
    public final void mo53497e(axrs axrs, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("WearableService", valueOf.length() == 0 ? new String("removeLocalCapability: ") : "removeLocalCapability: ".concat(valueOf));
            }
            ayfw ayfw = this.f97745x;
            ayiy ayiy = new ayiy(3, this);
            String valueOf2 = String.valueOf(str);
            ayfw.mo53994a(ayiy, new ayhv(this, valueOf2.length() == 0 ? new String("removeLocalCapability:") : "removeLocalCapability:".concat(valueOf2), str, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: f */
    public final void mo53499f(axrs axrs, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                sb.append("closeChannel: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayih(this, "closeChannel", str, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53463a(axrs axrs, byte b) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb = new StringBuilder(23);
                sb.append("sendRemoteCommand: ");
                sb.append((int) b);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayir(this, "sendAmsRemoteCommand", axrs, b));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final void mo53482b(axrs axrs, int i) {
        m84049b();
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("doAncsPositiveAction: ");
                sb.append(i);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayio(this, "doAncsPositiveAction", axrs, i));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: c */
    public final void mo53492c(axrs axrs, Uri uri) {
        mo53484b(axrs, uri, 0);
    }

    /* renamed from: c */
    public final void mo53493c(axrs axrs, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(str).length());
                sb.append("disableConnection: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(str);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayix(this, "disableDeviceConnection", str, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53464a(axrs axrs, int i) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("getConnectedCapabilities: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayht(this, "getAllCapabilities", i, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final void mo53483b(axrs axrs, Uri uri) {
        mo53466a(axrs, uri, 0);
    }

    /* renamed from: b */
    public final void mo53484b(axrs axrs, Uri uri, int i) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
                sb.append("deleteDataItems: ");
                sb.append(valueOf);
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            ayfw ayfw = this.f97745x;
            ayiy ayiy = new ayiy(3, this);
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
            sb2.append("deleteDataItemsByUriFilter:");
            sb2.append(valueOf3);
            ayfw.mo53994a(ayiy, new ayhm(this, sb2.toString(), i, axrs, uri));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53465a(axrs axrs, Uri uri) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(valueOf2).length());
                sb.append("getDataItem: ");
                sb.append(valueOf);
                sb.append(": ");
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            if (ayao.m83708a(uri) == 2) {
                ayfw ayfw = this.f97745x;
                ayiy ayiy = new ayiy(3, this);
                String valueOf3 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 12);
                sb2.append("getDataItem:");
                sb2.append(valueOf3);
                ayfw.mo53994a(ayiy, new ayhi(this, sb2.toString(), uri, axrs));
            } else {
                String valueOf4 = String.valueOf(uri);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 51);
                sb3.append("Called getDataItem with a non-exact uri. Provided: ");
                sb3.append(valueOf4);
                Log.w("WearableService", sb3.toString());
                axrs.mo53454a(new GetDataItemResponse(13, null));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final void mo53485b(axrs axrs, axrp axrp, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("getChannelOutputStream: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayil(this, "getChannelOutputStream", str, axrs, axrp));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Deprecated
    /* renamed from: b */
    public final void mo53486b(axrs axrs, ConnectionConfiguration connectionConfiguration) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(connectionConfiguration);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
                sb.append("putConnection: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            if (connectionConfiguration != null) {
                m84049b();
                this.f97745x.mo53994a(new ayiy(3, this), new ayhn(this, "setConfig", connectionConfiguration, axrs));
            } else {
                Log.w("WearableService", "putConnection: called with null config. Ignoring.");
                axrs.mo53437a(new Status(0));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53466a(axrs axrs, Uri uri, int i) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
                sb.append("getDataItemsByUri: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            ayfw ayfw = this.f97745x;
            ayiy ayiy = new ayiy(3, this);
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
            sb2.append("getDataItemsByUriFilter:");
            sb2.append(valueOf3);
            ayfw.mo53994a(ayiy, new ayhk(this, sb2.toString(), i, axrs, uri));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53467a(axrs axrs, axrp axrp, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("getChannelInputStream: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayik(this, "getChannelInputStream", str, axrs, axrp));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final void mo53487b(axrs axrs, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19 + String.valueOf(str).length());
                sb.append("enableConnection: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(str);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayiw(this, "enableDeviceConnection", str, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53468a(axrs axrs, Asset asset) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(valueOf2).length());
                sb.append("getFdForAsset: ");
                sb.append(valueOf);
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            ayfw ayfw = this.f97745x;
            ayiy ayiy = new ayiy(3, this);
            String valueOf3 = String.valueOf(asset.f110861b);
            ayfw.mo53994a(ayiy, new ayhp(this, valueOf3.length() == 0 ? new String("getFdForAsset:") : "getFdForAsset:".concat(valueOf3), asset, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final void mo53488b(axrs axrs, String str, int i) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("closeChannelWithError: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayii(this, "closeChannelWithError", str, i, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53469a(axrs axrs, ConnectionConfiguration connectionConfiguration) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(connectionConfiguration);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12 + String.valueOf(valueOf2).length());
                sb.append("putConfig: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            if (connectionConfiguration != null) {
                m84049b();
                this.f97745x.mo53994a(new ayiy(3, this), new ayit(this, "putConfig", connectionConfiguration, axrs));
            } else {
                Log.w("WearableService", "putConfig: called with null config. Ignoring.");
                axrs.mo53437a(new Status(0));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: b */
    public final void mo53489b(axrs axrs, boolean z) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb = new StringBuilder(29);
                sb.append("setCloudSyncSetting to: ");
                sb.append(z);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayhe(this, "setCloudSyncSetting", z, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53470a(axrs axrs, PutDataRequest putDataRequest) {
        int i;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(putDataRequest);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9 + String.valueOf(valueOf2).length());
                sb.append("putData: ");
                sb.append(valueOf);
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            byte[] bArr = putDataRequest.f110876c;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            for (String str : putDataRequest.mo60251a().keySet()) {
                i += str.length();
            }
            if (((long) (i + putDataRequest.f110874a.toString().length())) <= chnj.f188812a.mo6606a().mo85382H()) {
                Iterator it = putDataRequest.mo60251a().entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((Asset) ((Map.Entry) it.next()).getValue()).f110863d != null) {
                            Log.w("DataItems", "Asset.createFromUri behaviour has changed. App needs to be recompiled with the latest google-play-services library.");
                            axrs.mo53458a(new PutDataResponse(4005, null));
                            break;
                        }
                    } else {
                        ayfw ayfw = this.f97745x;
                        ayiy ayiy = new ayiy(3, this);
                        String valueOf3 = String.valueOf(putDataRequest.f110874a);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 8);
                        sb2.append("putData:");
                        sb2.append(valueOf3);
                        ayfw.mo53994a(ayiy, new ayhh(this, sb2.toString(), putDataRequest, axrs));
                        break;
                    }
                }
            } else {
                axrs.mo53458a(new PutDataResponse(4003, null));
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (NullPointerException e) {
            Log.e("WearableService", "NPE in putData", e);
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            bqye.m113760a(e, printWriter);
            printWriter.flush();
            throw new NullPointerException(stringWriter.toString());
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo53471a(axrs axrs, AddListenerRequest addListenerRequest) {
        boolean a = ayha.m83999e() ? this.f97746y.mo53534a(this.f97726e.f96378b) : this.f97742u.mo24608b(Binder.getCallingUid());
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(addListenerRequest.f110878a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
                sb.append("addListener: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayhw(this, "addListener", addListenerRequest, a, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53472a(axrs axrs, AncsNotificationParcelable ancsNotificationParcelable) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(ancsNotificationParcelable);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("injectAncsNotificationForTesting: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayiq(this, "injectAncsNotificationForTesting", ancsNotificationParcelable, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53473a(axrs axrs, RemoveListenerRequest removeListenerRequest) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                String valueOf2 = String.valueOf(removeListenerRequest.f110962b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
                sb.append("removeListener: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(valueOf2);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayhx(this, "removeListener", removeListenerRequest, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53474a(axrs axrs, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(str).length());
                sb.append("removeConfig: ");
                sb.append(valueOf);
                sb.append(" ");
                sb.append(str);
                Log.d("WearableService", sb.toString());
            }
            if (!TextUtils.isEmpty(str)) {
                m84049b();
                this.f97745x.mo53994a(new ayiy(3, this), new ayiu(this, "removeConfig", str, axrs));
            } else {
                Log.w("WearableService", "removeConfig: called with null config. Ignoring.");
                axrs.mo53437a(new Status(0));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53475a(axrs axrs, String str, int i) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(str).length());
                sb.append("getConnectedCapability: ");
                sb.append(valueOf);
                sb.append(", ");
                sb.append(str);
                Log.d("WearableService", sb.toString());
            }
            ayfw ayfw = this.f97745x;
            ayiy ayiy = new ayiy(3, this);
            String valueOf2 = String.valueOf(str);
            ayfw.mo53994a(ayiy, new ayhs(this, valueOf2.length() == 0 ? new String("getCapability:") : "getCapability:".concat(valueOf2), str, i, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53476a(axrs axrs, String str, ParcelFileDescriptor parcelFileDescriptor) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("writeChannelInputToFileDescriptor: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayim(this, "writeChannelInputToFileDescriptor", str, parcelFileDescriptor, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53477a(axrs axrs, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("readChannelOutputFromFileDescriptor: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayin(this, "readChannelOutputFromFileDescriptor", str, parcelFileDescriptor, axrs, j, j2));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53478a(axrs axrs, String str, String str2) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(this.f97726e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                sb.append("openChannel: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97745x.mo53994a(new ayiy(3, this), new ayif(this, "openChannel", str, str2, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53479a(axrs axrs, String str, String str2, byte[] bArr) {
        String str3;
        int i;
        String str4 = str;
        String str5 = str2;
        byte[] bArr2 = bArr;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        axue a = this.f97744w.mo53995a(this.f97726e, str5);
        try {
            boolean z = false;
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(a);
                if (bArr2 != null) {
                    i = bArr2.length;
                } else {
                    i = 0;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30 + String.valueOf(str).length() + String.valueOf(str2).length());
                sb.append("sendMessage: ");
                sb.append(valueOf);
                sb.append(": ");
                sb.append(str4);
                sb.append(" ");
                sb.append(str5);
                sb.append(" (");
                sb.append(i);
                sb.append(")");
                Log.d("WearableService", sb.toString());
            }
            if (str4 == null) {
                axrs.mo53460a(new SendMessageResponse(4004, -1));
            } else {
                int i2 = 1;
                if ("com.google.android.wearable.app".equals(a.f96377a)) {
                    if (str5.startsWith("/s3")) {
                        z = true;
                    }
                }
                if (!z) {
                    i2 = 2;
                }
                if (!z) {
                    str3 = "sendMessageLo";
                } else {
                    str3 = "sendMessageHi";
                }
                StringBuilder sb2 = new StringBuilder(str3.length() + 2 + str.length() + String.valueOf(str2).length());
                sb2.append(str3);
                sb2.append(":");
                sb2.append(str4);
                sb2.append(",");
                sb2.append(str5);
                this.f97745x.mo53994a(new ayiy(Integer.valueOf(i2), this), new ayho(this, sb2.toString(), axrs, str, str2, bArr, a));
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53480a(axrs axrs, boolean z) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb = new StringBuilder(21);
                sb.append("optInCloudSync: ");
                sb.append(z);
                Log.d("WearableService", sb.toString());
            }
            m84049b();
            this.f97745x.mo53994a(new ayiy(3, this), new ayhb(this, "optInCloudSync", z, axrs));
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        int size = this.f97724c.size();
        StringBuilder sb = new StringBuilder(27);
        sb.append("Pending Events: ");
        sb.append(size);
        ssb.println(sb.toString());
        if (!this.f97723b.isEmpty()) {
            ssb.println("Listeners");
            ssb.mo26034a();
            for (Map.Entry entry : this.f97723b.entrySet()) {
                String hexString = Integer.toHexString(((IBinder) entry.getKey()).hashCode());
                String valueOf = String.valueOf(entry.getValue());
                StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 2 + String.valueOf(valueOf).length());
                sb2.append(hexString);
                sb2.append(": ");
                sb2.append(valueOf);
                ssb.println(sb2.toString());
            }
            ssb.mo26035b();
        }
    }
}
