package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: bgdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bgdr extends squ implements bgbs {

    /* renamed from: a */
    protected bfor f116172a = null;

    /* renamed from: b */
    protected bgjp f116173b;

    /* renamed from: g */
    protected final rsk f116174g;

    /* renamed from: h */
    protected final Map f116175h = new HashMap();

    /* renamed from: i */
    private final String f116176i;

    /* renamed from: j */
    private final int f116177j;

    /* renamed from: k */
    private bhcv f116178k = new bhcw();

    /* JADX WARNING: Illegal instructions before constructor call */
    public bgdr(String str, int i, rsk rsk) {
        super(new String[]{cesb.m138146b()}, r0, r1);
        rpr b = rpr.m34216b();
        adzt adzt = new adzt(Looper.myLooper());
        this.f116176i = str;
        this.f116177j = i;
        this.f116174g = rsk;
    }

    /* renamed from: a */
    protected static final void m98629a(rnt rnt, Status status) {
        if (rnt != null) {
            try {
                rnt.mo11797a(status);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: b */
    private final void m98630b(Context context, bgns bgns, PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, rnt rnt, bgjp bgjp) {
        rnt rnt2 = rnt;
        if (bero.m95593a(context, pendingIntent)) {
            m98629a(rnt2, Status.f30107a);
            return;
        }
        String str2 = this.f116176i;
        String hexString = Integer.toHexString(pendingIntent.hashCode());
        String targetPackage = pendingIntent.getTargetPackage();
        int length = str2.length();
        int length2 = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 42 + length2 + String.valueOf(targetPackage).length() + String.valueOf(str).length());
        sb.append("adding ");
        sb.append(str2);
        sb.append(" pendingIntent=");
        sb.append(hexString);
        sb.append(", packageName=");
        sb.append(targetPackage);
        sb.append(", tag=");
        sb.append(str);
        sb.toString();
        String g = mo62371g();
        if (g != null) {
            if (g.length() == 0) {
                new String("This feature is not supported on this device: ");
            } else {
                "This feature is not supported on this device: ".concat(g);
            }
            m98629a(rnt2, new Status(13, g));
            return;
        }
        bgcc a = mo62607a(pendingIntent, obj, z, bhcv, str, bgns);
        this.f116175h.put(pendingIntent, a);
        if (this.f116172a != null) {
            mo62615d(a);
        }
        mo62688b(bgjp);
        m98629a(rnt2, Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Intent mo62606a(bgcc bgcc);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bgcc mo62607a(PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, bgns bgns);

    /* renamed from: a */
    public final void mo62630a(bfor bfor) {
        this.f116172a = bfor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo62612a(Object obj, Bundle bundle, bgcc bgcc, Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo62613b(bgcc bgcc);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo62614c(bgcc bgcc);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo62615d(bgcc bgcc);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo62371g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo62616h();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo62686a(Context context, Object obj, Bundle bundle, bgcc bgcc) {
        Intent intent = new Intent();
        int i = this.f116177j;
        if (i >= 0) {
            intent.putExtra("com.google.android.location.internal.EXTRA_RELEASE_VERSION", i);
        }
        if (!mo62612a(obj, bundle, bgcc, intent)) {
            return 1;
        }
        if (bgcc.mo62597a(context, intent)) {
            return 2;
        }
        String valueOf = String.valueOf(bgcc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("Dropping intent receiver");
        sb.append(valueOf);
        sb.toString();
        this.f116174g.mo25067b((Parcelable) mo62606a(bgcc));
        if (this.f116172a == null) {
            return 0;
        }
        mo62613b(bgcc);
        return 0;
    }

    /* renamed from: a */
    public final PendingIntent mo62629a(String str) {
        for (PendingIntent pendingIntent : this.f116175h.keySet()) {
            if (str.equals(pendingIntent.getTargetPackage())) {
                return pendingIntent;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9714a(int i) {
        StringBuilder sb = new StringBuilder(36);
        sb.append("onListenersChanged flags ");
        sb.append(i);
        sb.toString();
        mo62688b(this.f116173b);
    }

    /* renamed from: a */
    public void mo62608a(PendingIntent pendingIntent, bgjp bgjp) {
        mo25984a(pendingIntent);
        mo62687b(pendingIntent, bgjp);
    }

    /* renamed from: a */
    public void mo62609a(Context context, bgns bgns, PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, rnt rnt, bgjp bgjp) {
        this.f116173b = bgjp;
        if (bero.m95592a()) {
            if (!cesb.m138148d()) {
                if (!bero.m95595b(context, bhcq.m100641b(pendingIntent), pendingIntent.getTargetPackage())) {
                }
            }
            mo25985a(pendingIntent, new beue(context, bhcq.m100641b(pendingIntent), pendingIntent.getTargetPackage(), z, false, pendingIntent, obj, bhcv, bgns));
        }
        m98630b(context, bgns, pendingIntent, obj, z, bhcv, str, rnt, bgjp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo62687b(PendingIntent pendingIntent, bgjp bgjp) {
        String str = this.f116176i;
        String hexString = Integer.toHexString(pendingIntent.hashCode());
        StringBuilder sb = new StringBuilder(str.length() + 24 + String.valueOf(hexString).length());
        sb.append("removing ");
        sb.append(str);
        sb.append(" pendingIntent ");
        sb.append(hexString);
        sb.toString();
        bgcc bgcc = (bgcc) this.f116175h.remove(pendingIntent);
        if (bgcc == null) {
            String valueOf = String.valueOf(pendingIntent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb2.append("Unable to find the pendingIntent to remove: ");
            sb2.append(valueOf);
            sb2.toString();
            return;
        }
        if (this.f116172a != null) {
            mo62614c(bgcc);
        }
        bgcc.mo62594a();
        mo62688b(bgjp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62688b(bgjp bgjp) {
        this.f116178k = new bhcw();
        for (bgcc bgcc : this.f116175h.values()) {
            bhcv bhcv = bgcc.f116023n;
            if (bhcv != null) {
                this.f116178k.mo63558a(bhcv);
            }
        }
        mo62631a(bgjp);
    }

    /* renamed from: a */
    public void mo62610a(Context context, Object obj, Bundle bundle, bgjp bgjp) {
        Iterator it = this.f116175h.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (cesb.m138150f()) {
                bero.m95594b(context, (PendingIntent) entry.getKey());
            }
            if (mo62686a(context, obj, bundle, (bgcc) entry.getValue()) == 0) {
                it.remove();
                z = true;
            }
        }
        if (z) {
            mo62688b(bgjp);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9718b(sqt sqt) {
        beue beue = (beue) sqt;
        String valueOf = String.valueOf(beue);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("onListenerActive listenerData ");
        sb.append(valueOf);
        sb.toString();
        m98630b(beue.f112467g, beue.f112465e, beue.f112463c, beue.f112464d, beue.f112461a, beue.f112466f, this.f116176i, null, null);
    }

    /* renamed from: a */
    public final void mo62631a(bgjp bgjp) {
        if (bgjp != null) {
            bgjp.f116622c.mo62846a(39, 0, new bghr(mo62616h(), mo62617i(), this.f116178k), true);
        }
    }

    /* renamed from: a */
    public final void mo62632a(PrintWriter printWriter) {
        printWriter.printf("####%s Stats Start\n", this.f116176i);
        String valueOf = String.valueOf(this.f116178k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Overall work source=");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        printWriter.println("Clients:");
        for (bgcc bgcc : this.f116175h.values()) {
            StringBuilder sb2 = new StringBuilder();
            long elapsedRealtime = SystemClock.elapsedRealtime() - bgcc.f116020k;
            sb2.append("  Duration: ");
            sb2.append(String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(elapsedRealtime / 3600000), Long.valueOf((elapsedRealtime % 3600000) / 60000), Long.valueOf((elapsedRealtime % 60000) / 1000)));
            sb2.append(", Package: ");
            sb2.append(bgcc.f116019j);
            sb2.append(", Tag: ");
            sb2.append(bgcc.f116022m);
            sb2.append(", WorkSource: ");
            sb2.append(bgcc.f116023n);
            printWriter.println(sb2.toString());
        }
        printWriter.printf("####%s Stats End\n", this.f116176i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9717a(sqt sqt) {
        beue beue = (beue) sqt;
        String valueOf = String.valueOf(beue);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("onListenerInactive listenerData ");
        sb.append(valueOf);
        sb.toString();
        mo62687b(beue.f112463c, (bgjp) null);
    }
}
