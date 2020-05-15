package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: je */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1102je {

    /* renamed from: A */
    public RemoteViews f22243A;

    /* renamed from: B */
    public String f22244B;

    /* renamed from: C */
    public long f22245C;

    /* renamed from: D */
    boolean f22246D;

    /* renamed from: E */
    public Notification f22247E;
    @Deprecated

    /* renamed from: F */
    public ArrayList f22248F;

    /* renamed from: a */
    public Context f22249a;

    /* renamed from: b */
    public ArrayList f22250b;

    /* renamed from: c */
    ArrayList f22251c;

    /* renamed from: d */
    CharSequence f22252d;

    /* renamed from: e */
    CharSequence f22253e;

    /* renamed from: f */
    public PendingIntent f22254f;

    /* renamed from: g */
    PendingIntent f22255g;

    /* renamed from: h */
    Bitmap f22256h;

    /* renamed from: i */
    public int f22257i;

    /* renamed from: j */
    public int f22258j;

    /* renamed from: k */
    public boolean f22259k;

    /* renamed from: l */
    public boolean f22260l;

    /* renamed from: m */
    C1106ji f22261m;

    /* renamed from: n */
    CharSequence f22262n;

    /* renamed from: o */
    int f22263o;

    /* renamed from: p */
    int f22264p;

    /* renamed from: q */
    boolean f22265q;

    /* renamed from: r */
    public String f22266r;

    /* renamed from: s */
    public boolean f22267s;

    /* renamed from: t */
    public boolean f22268t;

    /* renamed from: u */
    public String f22269u;

    /* renamed from: v */
    public Bundle f22270v;

    /* renamed from: w */
    public int f22271w;

    /* renamed from: x */
    public int f22272x;

    /* renamed from: y */
    public Notification f22273y;

    /* renamed from: z */
    public RemoteViews f22274z;

    @Deprecated
    public C1102je(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    protected static CharSequence m16571a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }
        return null;
    }

    /* renamed from: a */
    public void mo13617a(int i, int i2, boolean z) {
        this.f22263o = i;
        this.f22264p = i2;
        this.f22265q = z;
    }

    /* renamed from: a */
    public final void mo13619a(long j) {
        this.f22247E.when = j;
    }

    /* renamed from: a */
    public void mo13620a(PendingIntent pendingIntent) {
        this.f22254f = pendingIntent;
    }

    /* renamed from: a */
    public final void mo13628a(long[] jArr) {
        this.f22247E.vibrate = jArr;
    }

    /* renamed from: b */
    public Notification mo13629b() {
        RemoteViews remoteViews;
        Bundle a;
        RemoteViews a2;
        C1109jl jlVar = new C1109jl(this);
        C1106ji jiVar = jlVar.f22732b.f22261m;
        if (jiVar != null) {
            jiVar.mo13568a(jlVar);
        }
        if (jiVar != null) {
            remoteViews = jiVar.mo13756b();
        } else {
            remoteViews = null;
        }
        int i = Build.VERSION.SDK_INT;
        Notification build = jlVar.f22731a.build();
        if (remoteViews == null) {
            RemoteViews remoteViews2 = jlVar.f22732b.f22274z;
            if (remoteViews2 != null) {
                build.contentView = remoteViews2;
            }
        } else {
            build.contentView = remoteViews;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(jiVar == null || (a2 = jiVar.mo13755a()) == null)) {
            build.bigContentView = a2;
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
        if (!(jiVar == null || (a = C1108jk.m16819a(build)) == null)) {
            jiVar.mo13727a(a);
        }
        return build;
    }

    /* renamed from: b */
    public final void mo13630b(int i) {
        this.f22247E.icon = i;
    }

    /* renamed from: b */
    public final void mo13631b(PendingIntent pendingIntent) {
        this.f22247E.deleteIntent = pendingIntent;
    }

    /* renamed from: c */
    public void mo13634c() {
        this.f22268t = true;
    }

    /* renamed from: d */
    public final void mo13638d() {
        this.f22259k = false;
    }

    /* renamed from: e */
    public void mo13640e(CharSequence charSequence) {
        this.f22252d = m16571a(charSequence);
    }

    public C1102je(Context context, String str) {
        this.f22250b = new ArrayList();
        this.f22251c = new ArrayList();
        this.f22259k = true;
        this.f22268t = false;
        this.f22271w = 0;
        this.f22272x = 0;
        Notification notification = new Notification();
        this.f22247E = notification;
        this.f22249a = context;
        this.f22244B = str;
        notification.when = System.currentTimeMillis();
        this.f22247E.audioStreamType = -1;
        this.f22258j = 0;
        this.f22248F = new ArrayList();
        this.f22246D = true;
    }

    /* renamed from: a */
    private final void m16572a(int i, boolean z) {
        if (!z) {
            Notification notification = this.f22247E;
            notification.flags = (i ^ -1) & notification.flags;
            return;
        }
        Notification notification2 = this.f22247E;
        notification2.flags = i | notification2.flags;
    }

    /* renamed from: c */
    public final void mo13635c(PendingIntent pendingIntent) {
        this.f22255g = pendingIntent;
        m16572a(128, true);
    }

    /* renamed from: d */
    public final void mo13639d(CharSequence charSequence) {
        this.f22247E.tickerText = m16571a(charSequence);
    }

    /* renamed from: c */
    public void mo13636c(CharSequence charSequence) {
        this.f22262n = m16571a(charSequence);
    }

    /* renamed from: a */
    public final Bundle mo13615a() {
        if (this.f22270v == null) {
            this.f22270v = new Bundle();
        }
        return this.f22270v;
    }

    /* renamed from: c */
    public final void mo13637c(boolean z) {
        m16572a(8, z);
    }

    /* renamed from: a */
    public final void mo13616a(int i) {
        this.f22247E.defaults = i;
        if ((i & 4) != 0) {
            this.f22247E.flags |= 1;
        }
    }

    /* renamed from: a */
    public void mo13618a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f22250b.add(new C1099jb(i, charSequence, pendingIntent));
    }

    /* renamed from: a */
    public void mo13621a(Bitmap bitmap) {
        if (bitmap != null) {
            int i = Build.VERSION.SDK_INT;
        }
        this.f22256h = bitmap;
    }

    /* renamed from: b */
    public void mo13632b(CharSequence charSequence) {
        this.f22253e = m16571a(charSequence);
    }

    /* renamed from: a */
    public final void mo13622a(Uri uri) {
        this.f22247E.sound = uri;
        this.f22247E.audioStreamType = -1;
        int i = Build.VERSION.SDK_INT;
        this.f22247E.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    /* renamed from: b */
    public final void mo13633b(boolean z) {
        m16572a(2, z);
    }

    /* renamed from: a */
    public final void mo13623a(Bundle bundle) {
        Bundle bundle2 = this.f22270v;
        if (bundle2 == null) {
            this.f22270v = new Bundle(bundle);
        } else {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: a */
    public final void mo13624a(C1099jb jbVar) {
        this.f22250b.add(jbVar);
    }

    /* renamed from: a */
    public final void mo13625a(C1103jf jfVar) {
        jfVar.mo13690a(this);
    }

    /* renamed from: a */
    public final void mo13626a(C1106ji jiVar) {
        if (this.f22261m != jiVar) {
            this.f22261m = jiVar;
            if (jiVar != null && jiVar.f22527b != this) {
                jiVar.f22527b = this;
                C1102je jeVar = jiVar.f22527b;
                if (jeVar != null) {
                    jeVar.mo13626a(jiVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13627a(boolean z) {
        m16572a(16, z);
    }
}
