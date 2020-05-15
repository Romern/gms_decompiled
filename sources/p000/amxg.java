package p000;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.people.sync.focus.notification.NotificationReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amxg {

    /* renamed from: a */
    protected final String f76253a;

    /* renamed from: b */
    protected final C1102je f76254b;

    /* renamed from: c */
    protected final sex f76255c;

    /* renamed from: d */
    protected final Context f76256d;

    /* renamed from: e */
    protected final String f76257e;

    /* renamed from: f */
    protected final int f76258f;

    /* renamed from: g */
    protected final boolean f76259g;

    /* renamed from: h */
    protected final alsj f76260h;

    /* renamed from: i */
    protected final String f76261i;

    /* renamed from: j */
    protected final anaz f76262j;

    /* renamed from: k */
    protected int f76263k = -1;

    /* renamed from: l */
    protected int f76264l = -1;

    /* renamed from: m */
    protected String f76265m;

    /* renamed from: n */
    protected String f76266n;

    /* renamed from: o */
    protected long f76267o;

    /* renamed from: p */
    private amke f76268p;

    /* renamed from: q */
    private final int f76269q;

    /* renamed from: r */
    private final String f76270r;

    /* renamed from: s */
    private boolean f76271s;

    /* renamed from: t */
    private long f76272t;

    /* renamed from: u */
    private int f76273u;

    protected amxg(Context context, Account account, alsj alsj, anaz anaz, int i, int i2, String str) {
        int i3;
        PendingIntent pendingIntent = null;
        this.f76265m = null;
        this.f76266n = null;
        this.f76267o = 0;
        this.f76268p = amke.UNKNOWN_STAGE;
        this.f76273u = 1;
        this.f76271s = false;
        this.f76272t = 0;
        this.f76256d = context;
        this.f76260h = alsj;
        this.f76261i = account.name;
        this.f76262j = anaz;
        this.f76269q = i;
        this.f76258f = i2;
        this.f76253a = str;
        this.f76259g = cfyk.f186101a.mo6606a().mo83088R();
        this.f76257e = "com.google.android.gms.people.sync.focus.notification.sync_progress.tag.".concat(this.f76261i);
        this.f76255c = sex.m35104a(context);
        C1102je jeVar = new C1102je(context);
        jeVar.mo13636c(account.name);
        jeVar.mo13630b(!cfyk.m143819k() ? C0126R.C0127drawable.quantum_ic_google_white_24 : C0126R.C0127drawable.quantum_ic_contacts_product_white_24);
        jeVar.mo13627a(cfyk.f186101a.mo6606a().mo83075E());
        jeVar.mo13637c(true);
        jeVar.mo13619a(System.currentTimeMillis());
        if (!cfyk.m143813e()) {
            context.registerReceiver(new NotificationReceiver(this.f76260h, this), new IntentFilter(mo41509a()));
        }
        jeVar.mo13631b(m63606a(context, mo41509a()));
        this.f76254b = jeVar;
        if (cfyk.m143819k()) {
            this.f76254b.f22271w = C1133kh.m17843b(context, C0126R.color.quantum_googblue);
        }
        if (cfyk.f186101a.mo6606a().mo83073C()) {
            this.f76254b.mo13633b(true);
        }
        if (!cfyk.f186101a.mo6606a().mo83096Z()) {
            Intent c = mo41513c();
            if (c != null) {
                pendingIntent = PendingIntent.getActivity(this.f76256d, 0, c, 134217728);
            }
        } else {
            pendingIntent = m63606a(this.f76256d, mo41512b());
        }
        if (pendingIntent != null) {
            this.f76254b.f22254f = pendingIntent;
        }
        if (cfyk.f186101a.mo6606a().mo83080J()) {
            Bundle bundle = new Bundle();
            Resources resources = context.getResources();
            if (!cfyk.f186101a.mo6606a().mo83078H()) {
                i3 = !cfyk.f186101a.mo6606a().mo83079I() ? C0126R.string.people_fsa_notification_channel_group_name : C0126R.string.people_fsa_notification_channel_name;
            } else {
                i3 = C0126R.string.common_asm_google_account_title;
            }
            bundle.putString("android.substName", resources.getString(i3));
            this.f76254b.mo13623a(bundle);
        }
        this.f76270r = amxa.m63596a();
        int i4 = Build.VERSION.SDK_INT;
        if (cfyk.m143818j()) {
            int h = (int) cfyk.m143816h();
            if (h > 0) {
                int i5 = h - 1;
                while (true) {
                    if (i5 >= 0) {
                        String str2 = "com.google.android.gms.people.sync.focus.notification.fsa2_channel.id";
                        str2 = i5 != 0 ? str2.concat(Integer.toString(i5)) : str2;
                        if (this.f76255c.mo25437a(str2) != null) {
                            this.f76255c.mo25447b(str2);
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (this.f76255c.mo25437a(this.f76270r) == null) {
                    m63607f((int) cfyk.f186101a.mo6606a().mo83121y());
                }
            } else {
                Log.e(str, "Flag next_channel_version should be positive.");
            }
        } else if (this.f76255c.mo25437a(this.f76270r) == null) {
            m63607f(3);
        }
        this.f76254b.f22244B = this.f76270r;
    }

    /* renamed from: a */
    static final PendingIntent m63606a(Context context, String str) {
        return PendingIntent.getBroadcast(context, 0, new Intent(str).setPackage(context.getPackageName()), 134217728);
    }

    /* renamed from: f */
    private final void m63607f(int i) {
        int i2 = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannel = new NotificationChannel(this.f76270r, this.f76256d.getString(C0126R.string.people_fsa_notification_channel_name), i);
        if (this.f76255c.mo25449c("com.google.android.gms.people.sync.focus.notification.channel_group.id") == null) {
            this.f76255c.mo25443a(new NotificationChannelGroup("com.google.android.gms.people.sync.focus.notification.channel_group.id", this.f76256d.getResources().getString(C0126R.string.people_fsa_notification_channel_group_name)));
        }
        notificationChannel.setGroup("com.google.android.gms.people.sync.focus.notification.channel_group.id");
        this.f76255c.mo25442a(notificationChannel);
    }

    /* renamed from: g */
    private final void m63609g(int i) {
        int i2;
        bxvd da = amne.f75442f.mo74144da();
        if (this.f76273u == 1) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amne amne = (amne) da.f164949b;
        amne.f75445b = i2 - 1;
        int i3 = amne.f75444a | 1;
        amne.f75444a = i3;
        amne.f75446c = this.f76268p.f75063h;
        int i4 = i3 | 2;
        amne.f75444a = i4;
        int i5 = this.f76273u;
        int i6 = i5 - 1;
        if (i5 != 0) {
            amne.f75447d = i6;
            int i7 = i4 | 4;
            amne.f75444a = i7;
            amne.f75448e = i - 1;
            amne.f75444a = i7 | 8;
            amne amne2 = (amne) da.mo74062i();
            anaz anaz = this.f76262j;
            anbf anbf = new anbf(this.f76258f, this.f76257e);
            anbh anbh = (anbh) anaz;
            if (!anbh.f76566z.containsKey(anbf)) {
                anbh.f76566z.put(anbf, new ArrayList());
            }
            ((List) anbh.f76566z.get(anbf)).add(amne2);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract amke mo41508a(amjf amjf);

    /* renamed from: a */
    public abstract String mo41509a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41511a(int i, boolean z);

    /* renamed from: b */
    public abstract String mo41512b();

    /* renamed from: b */
    public final void mo41518b(int i) {
        if (i >= 0) {
            this.f76268p = mo41508a(amjf.GROUP);
            this.f76266n = this.f76256d.getResources().getQuantityString(C0126R.plurals.people_fsa_progress_notification_format_for_groups_sync, i, Integer.valueOf(i));
            this.f76265m = this.f76256d.getResources().getString(this.f76269q, this.f76266n);
            mo41522d(i);
        }
    }

    /* renamed from: c */
    public abstract Intent mo41513c();

    /* renamed from: c */
    public final void mo41520c(int i) {
        boolean z;
        boolean z2;
        if (i >= 0) {
            this.f76268p = mo41508a(amjf.PHOTO);
            Resources resources = this.f76256d.getResources();
            Integer valueOf = Integer.valueOf(i);
            this.f76266n = resources.getQuantityString(C0126R.plurals.people_fsa_progress_notification_format_for_photos_sync, i, valueOf);
            if (this.f76259g) {
                int i2 = this.f76263k / 2;
                if (!cfyk.f186101a.mo6606a().mo83087Q() || i2 != 0 || i <= 0) {
                    if (i2 > i) {
                        this.f76263k = i2 + i;
                    }
                    z = false;
                } else {
                    this.f76265m = this.f76256d.getResources().getString(this.f76269q, this.f76256d.getResources().getQuantityString(C0126R.plurals.people_fsa_progress_notification_format_for_contacts_sync, i, valueOf));
                    this.f76263k = i;
                    z = true;
                }
                if (i > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mo41515a(0, z, true, true, z2);
                return;
            }
            this.f76265m = this.f76256d.getResources().getString(this.f76269q, this.f76266n);
            mo41522d(i);
        }
    }

    /* renamed from: d */
    public final amxb mo41521d() {
        return new amxb(((anbh) this.f76262j).f76557q, this.f76261i, this.f76258f, this.f76268p, this.f76273u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Intent mo41523e() {
        Intent intent;
        if (!cfyk.f186101a.mo6606a().mo83091U()) {
            intent = new Intent("com.google.android.gms.people.sync.CONTACTS_SYNC_SETTINGS");
        } else {
            intent = new Intent().setClassName(this.f76256d, "com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity");
        }
        intent.putExtra("authAccount", this.f76261i);
        if (cfut.m143113b()) {
            int i = Build.VERSION.SDK_INT;
            intent.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority("com.google.android.gms.people.notification").build());
        }
        return intent;
    }

    /* renamed from: h */
    public final void mo41526h() {
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo82986ax()).booleanValue()) {
            return;
        }
        if (!cfyk.f186101a.mo6606a().mo83101e() || this.f76271s) {
            long S = cfyk.f186101a.mo6606a().mo83089S();
            if (cfyk.m143817i()) {
                long z = cfyk.f186101a.mo6606a().mo83122z() - ((System.currentTimeMillis() - this.f76272t) + S);
                if (z > 0) {
                    S += z;
                }
            }
            if (S > 0) {
                try {
                    Thread.sleep(S);
                } catch (InterruptedException e) {
                }
            }
            this.f76255c.mo25444a(this.f76257e, this.f76258f);
            if (cfyk.m143815g()) {
                m63609g(9);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo41522d(int i) {
        this.f76263k = i;
        this.f76264l = 0;
        if (!cfyk.m143811c()) {
            mo41515a(0, true, true, true, true);
        }
    }

    /* renamed from: a */
    public void mo41510a(int i) {
        if (i >= 0) {
            this.f76268p = mo41508a(amjf.CONTACT);
            this.f76266n = this.f76256d.getResources().getQuantityString(C0126R.plurals.people_fsa_progress_notification_format_for_contacts_sync, i, Integer.valueOf(i));
            this.f76265m = this.f76256d.getResources().getString(this.f76269q, this.f76266n);
            if (this.f76259g) {
                i += i;
            }
            mo41522d(i);
        }
    }

    /* renamed from: b */
    public final void mo41519b(int i, boolean z) {
        int i2;
        this.f76268p = amke.UNKNOWN_STAGE;
        if (!z) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        this.f76273u = i2;
        this.f76254b.mo13627a(cfyk.f186101a.mo6606a().mo83076F());
        this.f76254b.mo13633b(false);
        mo41511a(i, z);
    }

    /* renamed from: f */
    public static boolean m63608f() {
        amig.m62939a();
        return Boolean.valueOf(cfvk.f185780a.mo6606a().mo82966ad()).booleanValue();
    }

    /* renamed from: e */
    public final void mo41524e(int i) {
        if (i > 0) {
            if (cfyk.m143811c() && this.f76264l == 0) {
                mo41515a(0, true, true, true, true);
            }
            mo41515a(i, false, false, false, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41515a(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2 = this.f76263k;
        if (i2 > 0) {
            int i3 = this.f76264l + i;
            this.f76264l = i3;
            if (i3 > i2) {
                amdk.m62659b(this.f76253a, "Current progress %d exceeds max progress %d", Integer.valueOf(i3), Integer.valueOf(this.f76263k));
                this.f76264l = this.f76263k;
            }
            if (z) {
                C1102je jeVar = this.f76254b;
                jeVar.mo13640e(this.f76265m);
                jeVar.mo13639d(this.f76265m);
            }
            if (cfyk.f186101a.mo6606a().mo83082L() && z2) {
                this.f76254b.mo13632b(this.f76266n);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f76267o;
            if (!z3) {
                amig.m62939a();
                if (currentTimeMillis - j < Long.valueOf(cfvk.f185780a.mo6606a().mo83024by()).longValue()) {
                    return;
                }
            }
            mo41517a(z4);
        }
    }

    /* renamed from: g */
    public final void mo41525g() {
        if (this.f76264l > 0) {
            mo41515a(0, false, false, true, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: je.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      je.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, int, boolean):void */
    /* renamed from: a */
    public final void mo41516a(amxg amxg) {
        this.f76254b.mo13617a(this.f76263k, this.f76264l, false);
        if (cfyk.m143813e() && !this.f76271s) {
            amxc.m63597a(this.f76256d, this.f76260h, amxg);
        }
        this.f76255c.mo25445a(this.f76257e, this.f76258f, this.f76254b.mo13629b());
        if (cfyk.m143817i() && !this.f76271s) {
            this.f76272t = System.currentTimeMillis();
        }
        this.f76271s = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41517a(boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (this.f76255c.mo25449c("com.google.android.gms.people.sync.focus.notification.channel_group.id") == null || this.f76255c.mo25449c("com.google.android.gms.people.sync.focus.notification.channel_group.id").isBlocked()) {
            Log.i(this.f76253a, "Notifications are disabled for channel group.");
            i = 3;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            if (this.f76255c.mo25437a(this.f76270r) == null || this.f76255c.mo25437a(this.f76270r).getImportance() == 0) {
                Log.i(this.f76253a, "Notifications are disabled for the channel.");
                i = 4;
            } else {
                int i4 = Build.VERSION.SDK_INT;
                if (!this.f76255c.mo25453e()) {
                    Log.i(this.f76253a, "Notifications are disabled for GmsCore.");
                    i = 2;
                } else {
                    i = 5;
                }
            }
        }
        if (i == 5) {
            if (!cfyk.f186101a.mo6606a().mo83090T()) {
                mo41516a(this);
            } else {
                new adzt(Looper.getMainLooper()).post(new amxf(this, this));
            }
            this.f76267o = System.currentTimeMillis();
        }
        if (cfyk.m143815g() && z) {
            m63609g(i);
        }
    }
}
