package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.io.PrintWriter;

/* renamed from: bgdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgdt implements bgbs {

    /* renamed from: a */
    private final bgbs f116179a;

    /* renamed from: b */
    private final Object f116180b;

    public bgdt(bgbs bgbs, Object obj) {
        this.f116179a = bgbs;
        this.f116180b = obj;
    }

    /* renamed from: a */
    public final PendingIntent mo62629a(String str) {
        PendingIntent a;
        synchronized (this.f116180b) {
            a = this.f116179a.mo62629a(str);
        }
        return a;
    }

    /* renamed from: i */
    public final Object mo62617i() {
        throw null;
    }

    /* renamed from: a */
    public final void mo62608a(PendingIntent pendingIntent, bgjp bgjp) {
        synchronized (this.f116180b) {
            this.f116179a.mo62608a(pendingIntent, bgjp);
        }
    }

    /* renamed from: a */
    public final void mo62609a(Context context, bgns bgns, PendingIntent pendingIntent, Object obj, boolean z, bhcv bhcv, String str, rnt rnt, bgjp bgjp) {
        synchronized (this.f116180b) {
            this.f116179a.mo62609a(context, bgns, pendingIntent, obj, z, bhcv, str, rnt, bgjp);
        }
    }

    /* renamed from: a */
    public final void mo62610a(Context context, Object obj, Bundle bundle, bgjp bgjp) {
        synchronized (this.f116180b) {
            this.f116179a.mo62610a(context, obj, bundle, bgjp);
        }
    }

    /* renamed from: a */
    public final void mo62630a(bfor bfor) {
        synchronized (this.f116180b) {
            this.f116179a.mo62630a(bfor);
        }
    }

    /* renamed from: a */
    public final void mo62631a(bgjp bgjp) {
        synchronized (this.f116180b) {
            this.f116179a.mo62631a(bgjp);
        }
    }

    /* renamed from: a */
    public final void mo62632a(PrintWriter printWriter) {
        synchronized (this.f116180b) {
            this.f116179a.mo62632a(printWriter);
        }
    }
}
