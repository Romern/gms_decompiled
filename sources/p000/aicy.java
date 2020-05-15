package p000;

import android.content.Intent;
import android.graphics.Bitmap;

/* renamed from: aicy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aicy {

    /* renamed from: a */
    public String f68744a;

    /* renamed from: b */
    public String f68745b;

    /* renamed from: c */
    public String f68746c;

    /* renamed from: d */
    public String f68747d;

    /* renamed from: e */
    public String f68748e;

    /* renamed from: f */
    public int f68749f;

    /* renamed from: g */
    public Bitmap f68750g;

    /* renamed from: h */
    public Intent f68751h;

    /* renamed from: i */
    public Intent f68752i;

    /* renamed from: j */
    public boolean f68753j;

    /* renamed from: k */
    public String f68754k;

    /* renamed from: l */
    public boolean f68755l;

    /* renamed from: m */
    public boolean f68756m;

    /* renamed from: n */
    private boolean f68757n;

    /* renamed from: a */
    public final aicz mo37423a() {
        String str = this.f68744a;
        if (str != null) {
            Intent intent = this.f68751h;
            if (intent != null) {
                Intent intent2 = this.f68752i;
                if (intent2 != null) {
                    return new aicz(str, this.f68745b, this.f68746c, this.f68747d, this.f68748e, this.f68749f, this.f68750g, intent, intent2, this.f68753j, this.f68754k, this.f68757n, this.f68755l, this.f68756m);
                }
                throw new IllegalStateException("DiscoveryNotificationItem.dismissIntent cannot be null");
            }
            throw new IllegalStateException("DiscoveryNotificationItem.actionIntent cannot be null");
        }
        throw new IllegalStateException("DiscoveryNotificationItem.notificationId cannot be null");
    }

    /* renamed from: b */
    public final void mo37424b() {
        this.f68757n = true;
    }
}
