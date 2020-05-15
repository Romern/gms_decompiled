package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: bgty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgty {

    /* renamed from: a */
    public boolean f117535a;

    /* renamed from: b */
    private final Context f117536b;

    /* renamed from: c */
    private final PendingIntent f117537c;

    /* renamed from: d */
    private final Account f117538d;

    private bgty(Context context, PendingIntent pendingIntent, Account account) {
        sdo.m34959a(context);
        this.f117536b = context;
        sdo.m34959a(pendingIntent);
        this.f117537c = pendingIntent;
        this.f117538d = account;
    }

    /* renamed from: b */
    public final void mo63170b() {
        String valueOf = String.valueOf(this.f117538d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("Place inference reporting - stop for ");
        sb.append(valueOf);
        sb.toString();
        if (!this.f117535a) {
            String valueOf2 = String.valueOf(this.f117538d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Place inference reporting - already stopped for ");
            sb2.append(valueOf2);
            sb2.toString();
        } else if (chcy.f188471a.mo6606a().mo85130d()) {
            aema.m52140a(this.f117536b).mo34302f(this.f117537c).mo50371a(new bgtx(this));
        }
    }

    /* renamed from: a */
    public static bgty m99940a(Context context, Account account) {
        Intent a = bgxx.m100272a(context, "com.google.android.location.reporting.ACTION_PLACE_INFERENCE", "placeInferences");
        if (account != null) {
            a.setData(Uri.fromParts("mailto:", account.name, account.type));
        }
        return new bgty(context, PendingIntent.getService(context, 0, a, 134217728), account);
    }

    /* renamed from: a */
    public final void mo63169a() {
        String valueOf = String.valueOf(this.f117538d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Place inference reporting - start for ");
        sb.append(valueOf);
        sb.toString();
        if (this.f117535a) {
            String valueOf2 = String.valueOf(this.f117538d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
            sb2.append("Place inference reporting - already started for ");
            sb2.append(valueOf2);
            sb2.toString();
            return;
        }
        aelm a = aema.m52140a(this.f117536b);
        aely aely = new aely();
        aely.f63500c = (int) chbu.m148135d();
        a.mo34300a(aely.mo34318a(), this.f117537c).mo50371a(new bgtw(this));
    }
}
