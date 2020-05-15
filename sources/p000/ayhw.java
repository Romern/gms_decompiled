package p000;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.AddListenerRequest;

/* renamed from: ayhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhw extends ayfu {

    /* renamed from: c */
    final /* synthetic */ AddListenerRequest f97633c;

    /* renamed from: d */
    final /* synthetic */ boolean f97634d;

    /* renamed from: e */
    final /* synthetic */ axrs f97635e;

    /* renamed from: f */
    final /* synthetic */ ayja f97636f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhw(ayja ayja, String str, AddListenerRequest addListenerRequest, boolean z, axrs axrs) {
        super(str);
        this.f97636f = ayja;
        this.f97633c = addListenerRequest;
        this.f97634d = z;
        this.f97635e = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            IBinder asBinder = this.f97633c.f110878a.asBinder();
            String str = this.f97633c.f110880c;
            if (str != null) {
                axvz.m83357a(this.f97636f.f97726e, str);
            }
            ayja ayja = this.f97636f;
            AddListenerRequest addListenerRequest = this.f97633c;
            ayiz ayiz = new ayiz(ayja, addListenerRequest.f110878a, addListenerRequest.f110879b, addListenerRequest.f110880c, this.f97634d, addListenerRequest.f110881d);
            if (this.f97636f.f97723b.putIfAbsent(asBinder, ayiz) != null) {
                String valueOf = String.valueOf(this.f97633c);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("addListener: Duplicate listener for ");
                sb.append(valueOf);
                Log.w("WearableService", sb.toString());
                this.f97635e.mo53437a(new Status(4001));
                return;
            }
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf2 = String.valueOf(ayiz);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("addListener: Added record ");
                sb2.append(valueOf2);
                Log.d("WearableService", sb2.toString());
            }
            try {
                asBinder.linkToDeath(ayiz, 0);
                this.f97635e.mo53437a(new Status(0));
            } catch (RemoteException e) {
                String valueOf3 = String.valueOf(this.f97633c);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                sb3.append("addListener: Exception for ");
                sb3.append(valueOf3);
                Log.w("WearableService", sb3.toString(), e);
                ayiz.binderDied();
                this.f97635e.mo53437a(new Status(13));
            }
        } catch (Exception e2) {
            Log.e("WearableService", "addListener: exception during processing", e2);
            this.f97635e.mo53437a(new Status(8));
        }
    }
}
