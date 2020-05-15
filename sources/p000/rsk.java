package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: rsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rsk {

    /* renamed from: a */
    private final Object f43581a = new Object();

    /* renamed from: b */
    private final Context f43582b;

    /* renamed from: c */
    private final String f43583c;

    /* renamed from: d */
    private final List f43584d = new ArrayList();

    /* renamed from: e */
    private final rsg f43585e;

    /* renamed from: f */
    private boolean f43586f = false;

    /* renamed from: g */
    private ArrayList f43587g = null;

    /* renamed from: h */
    private String f43588h;

    /* renamed from: i */
    private final int f43589i;

    public rsk(Context context, String str, rsg rsg, int i) {
        this.f43582b = context;
        sdo.m34959a((Object) str);
        this.f43583c = str;
        this.f43585e = rsg;
        this.f43589i = i;
        m34339g();
    }

    /* renamed from: a */
    public static rsk m34333a(Context context, String str, int i, rsg rsg) {
        return new rsk(context, str, rsg, i);
    }

    /* renamed from: b */
    public static int m34336b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.location.cache.cache_type")) {
            return -1;
        }
        return extras.getInt("com.google.android.location.cache.cache_type");
    }

    /* renamed from: f */
    private final void m34338f() {
        Intent h = m34340h();
        h.putParcelableArrayListExtra("com.google.android.location.cache.cache_data", this.f43587g);
        h.putExtra("com.google.android.location.cache.cache_id", this.f43588h);
        PendingIntent.getService(this.f43582b, this.f43589i, h, 134217728);
    }

    /* renamed from: g */
    private final void m34339g() {
        PendingIntent service = PendingIntent.getService(this.f43582b, this.f43589i, m34340h(), 0);
        try {
            new skc(this.f43582b).mo25675a("SystemMemoryCache", 2, SystemClock.elapsedRealtime() + 315360000000L, service, "com.google.android.gms");
        } catch (BadParcelableException e) {
            if (Log.isLoggable("SystemMemoryCache", 6)) {
                Log.e("SystemMemoryCache", "Cache malformed.", e);
            }
        }
        m34334a(service);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: h */
    private final Intent m34340h() {
        Intent className = new Intent().setClassName(this.f43582b, this.f43583c);
        className.putExtra("com.google.android.location.cache.is_cache", true);
        className.putExtra("com.google.android.location.cache.cache_type", this.f43589i);
        return className;
    }

    /* renamed from: c */
    public final void mo25069c() {
        synchronized (this.f43581a) {
            if (!mo25065a()) {
                this.f43584d.add(new rsf(this));
            } else {
                mo25072d();
                m34338f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo25072d() {
        this.f43587g.clear();
    }

    /* renamed from: e */
    public final List mo25074e() {
        synchronized (this.f43581a) {
            ArrayList arrayList = this.f43587g;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            return arrayList3;
        }
    }

    /* renamed from: a */
    private static final void m34334a(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
            }
        }
    }

    /* renamed from: d */
    public final void mo25073d(Parcelable parcelable) {
        Iterator it = this.f43587g.iterator();
        while (it.hasNext()) {
            if (this.f43585e.mo9591a((Parcelable) it.next(), parcelable)) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static boolean m34335a(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            Bundle extras = intent.getExtras();
            return extras != null && extras.containsKey("com.google.android.location.cache.is_cache");
        } catch (BadParcelableException e) {
            if (Log.isLoggable("SystemMemoryCache", 6)) {
                Log.e("SystemMemoryCache", "Cache malformed.", e);
            }
            return false;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static rsk m34337b(Context context, String str, int i, rsg rsg) {
        return new rsk(context, str, rsg, i);
    }

    /* renamed from: b */
    public final String mo25066b() {
        String str;
        synchronized (this.f43581a) {
            str = this.f43588h;
        }
        return str;
    }

    /* renamed from: a */
    public final void mo25062a(Parcelable parcelable) {
        synchronized (this.f43581a) {
            if (!mo25065a()) {
                this.f43584d.add(new rsd(this, parcelable));
            } else {
                mo25071c(parcelable);
                m34338f();
            }
        }
    }

    /* renamed from: b */
    public final void mo25067b(Parcelable parcelable) {
        synchronized (this.f43581a) {
            if (!mo25065a()) {
                this.f43584d.add(new rsi(this, parcelable));
            } else {
                mo25073d(parcelable);
                m34338f();
            }
        }
    }

    /* renamed from: c */
    public final void mo25070c(Intent intent) {
        boolean z;
        synchronized (this.f43581a) {
            if (mo25065a()) {
                return;
            }
            if (m34335a(intent)) {
                ArrayList parcelableArrayList = intent.getExtras().getParcelableArrayList("com.google.android.location.cache.cache_data");
                this.f43587g = parcelableArrayList;
                if (parcelableArrayList == null) {
                    this.f43587g = new ArrayList();
                }
                if (this.f43584d.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string = intent.getExtras().getString("com.google.android.location.cache.cache_id");
                this.f43588h = string;
                if (string == null) {
                    this.f43588h = UUID.randomUUID().toString();
                    z = true;
                }
                for (rse rse : this.f43584d) {
                    rse.mo25061a();
                }
                this.f43584d.clear();
                if (z) {
                    m34338f();
                }
                this.f43586f = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo25063a(PrintWriter printWriter) {
        String valueOf = String.valueOf(this.f43583c);
        printWriter.println(valueOf.length() == 0 ? new String("SystemMemoryCache for ") : "SystemMemoryCache for ".concat(valueOf));
        int i = this.f43589i;
        StringBuilder sb = new StringBuilder(19);
        sb.append(" type = ");
        sb.append(i);
        printWriter.println(sb.toString());
        String valueOf2 = String.valueOf(this.f43588h);
        printWriter.println(valueOf2.length() == 0 ? new String(" id = ") : " id = ".concat(valueOf2));
        String valueOf3 = String.valueOf(this.f43587g);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 13);
        sb2.append(" cacheData = ");
        sb2.append(valueOf3);
        printWriter.println(sb2.toString());
    }

    /* renamed from: b */
    public final void mo25068b(Collection collection) {
        this.f43587g.clear();
        this.f43587g.addAll(collection);
    }

    /* renamed from: a */
    public final void mo25064a(Collection collection) {
        synchronized (this.f43581a) {
            if (!mo25065a()) {
                this.f43584d.add(new rsj(this, collection));
            } else {
                mo25068b(collection);
                m34338f();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25065a() {
        boolean z;
        synchronized (this.f43581a) {
            z = this.f43586f;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo25071c(Parcelable parcelable) {
        mo25073d(parcelable);
        this.f43587g.add(parcelable);
    }
}
