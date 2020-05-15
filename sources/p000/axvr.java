package p000;

import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import java.util.EnumMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: axvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axvr implements ayaf {

    /* renamed from: a */
    public final Handler f96494a;

    /* renamed from: b */
    public final ayfj f96495b;

    /* renamed from: c */
    public final axvq f96496c;

    /* renamed from: d */
    public final axvt f96497d;

    /* renamed from: e */
    public final axzh f96498e;

    /* renamed from: f */
    public final AtomicBoolean f96499f = new AtomicBoolean();

    /* renamed from: g */
    public final Runnable f96500g = new axvo(this);

    /* renamed from: h */
    public final axxc f96501h = new axvk(this);

    /* renamed from: i */
    private final Object f96502i = new Object();

    /* renamed from: j */
    private final EnumMap f96503j = new EnumMap(ayem.class);

    /* renamed from: k */
    private final axyj f96504k;

    /* renamed from: l */
    private final ayge f96505l;

    public axvr(axzh axzh, Handler handler, ayfj ayfj, Random random, axyj axyj, ayge ayge) {
        sdo.m34959a(axzh);
        this.f96498e = axzh;
        sdo.m34959a((Object) handler);
        this.f96494a = handler;
        sdo.m34959a(ayfj);
        this.f96495b = ayfj;
        this.f96496c = new axvq(this.f96495b);
        sdo.m34959a(axyj);
        this.f96504k = axyj;
        this.f96497d = new axvt(random);
        sdo.m34959a(ayge);
        this.f96505l = ayge;
    }

    /* renamed from: a */
    public static final void m83316a(axrs axrs, int i) {
        try {
            axrs.mo53441a(new ChannelSendFileResponse(i));
        } catch (RemoteException e) {
            Log.w("ChannelManager", "Failed to set result on Channel.sendFile", e);
        }
    }

    /* renamed from: b */
    public static final void m83317b(axrs axrs, int i) {
        sdo.m34975b(true, "callOnGetChannelInputStream called with SUCCESS");
        try {
            axrs.mo53446a(new GetChannelInputStreamResponse(i, null));
        } catch (RemoteException e) {
            Log.w("ChannelManager", "Failed to set failure result on Channel.getInputStream", e);
        }
    }

    /* renamed from: c */
    public static final void m83318c(axrs axrs, int i) {
        sdo.m34975b(true, "callOnGetChannelOutputStream called with SUCCESS");
        try {
            axrs.mo53447a(new GetChannelOutputStreamResponse(i, null));
        } catch (RemoteException e) {
            Log.w("ChannelManager", "Failed to set failure result on Channel.getInputStream", e);
        }
    }

    /* renamed from: d */
    public static final void m83319d(axrs axrs, int i) {
        try {
            axrs.mo53440a(new ChannelReceiveFileResponse(i));
        } catch (RemoteException e) {
            Log.w("ChannelManager", "Failed to set result on Channel.receiveFile", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final axvx mo53623a(ayem ayem, axvz axvz, boolean z) {
        aygb aygb;
        boolean z2;
        axvq axvq = this.f96496c;
        sdo.m34959a(axvz);
        axvp axvp = new axvp(axvq, axvz);
        axyj axyj = this.f96504k;
        axvm axvm = new axvm(this, axvz);
        synchronized (this.f96502i) {
            aygb = (aygb) this.f96503j.get(ayem);
            if (aygb != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String valueOf = String.valueOf(ayem);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("No callbacks set for ");
            sb.append(valueOf);
            sdo.m34971a(z2, (Object) sb.toString());
        }
        return new axvx(axvz, ayem, axvp, axyj, axvm, aygb, z, this.f96505l);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [ayem, aygb]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo53624a(ayem ayem, aygb aygb) {
        synchronized (this.f96502i) {
            if (aygb == null) {
                this.f96503j.remove(ayem);
            } else if (!this.f96503j.containsKey(ayem)) {
                this.f96503j.put((Enum) ayem, (Object) aygb);
            } else {
                String valueOf = String.valueOf(ayem);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Called setCallbacks twice for same origin: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo53625a(Runnable runnable) {
        if (!this.f96499f.get()) {
            Log.w("ChannelManager", "Called methods on ChannelManager while not running");
            return;
        }
        this.f96494a.post(runnable);
        this.f96495b.mo53620b();
    }
}
