package p000;

import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgl extends C1102je {

    /* renamed from: G */
    private final Context f67163G;

    /* renamed from: H */
    private final List f67164H = new ArrayList();

    public ahgl(Context context, String str) {
        super(context, str);
        this.f67163G = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo13620a(PendingIntent pendingIntent) {
        this.f22254f = pendingIntent;
    }

    /* renamed from: b */
    public final void mo13618a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        super.mo13618a(qkj.m32287a(this.f67163G, i), charSequence, pendingIntent);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo13634c() {
        this.f22268t = true;
    }

    /* renamed from: d */
    public final void mo36434d(PendingIntent pendingIntent) {
        super.mo13631b(pendingIntent);
    }

    /* renamed from: e */
    public final void mo36436e() {
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList(this.f67164H.size());
        List list = this.f67164H;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ahgs ahgs = (ahgs) list.get(i2);
            Person.Builder builder = new Person.Builder();
            boolean z = ahgs.f67187d;
            Person.Builder bot = builder.setBot(false);
            boolean z2 = ahgs.f67188e;
            Person.Builder important = bot.setImportant(false);
            CharSequence charSequence = ahgs.f67184a;
            if (charSequence != null) {
                important.setName(charSequence);
            }
            Icon icon = ahgs.f67185b;
            if (icon != null) {
                important.setIcon(icon);
            }
            String str = ahgs.f67186c;
            if (str != null) {
                important.setKey(str);
            }
            arrayList.add(important.build());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("android.people.list", arrayList);
        super.mo13623a(bundle);
    }

    /* renamed from: f */
    public final void mo36437f() {
        super.mo13627a(false);
    }

    /* renamed from: g */
    public final void mo36439g() {
        super.mo13616a(-1);
    }

    /* renamed from: h */
    public final void mo36441h() {
        super.mo13633b(true);
    }

    /* renamed from: i */
    public final void mo36442i() {
        super.mo13630b(qkj.m32287a(this.f67163G, C0126R.C0127drawable.sharing_ic_notification));
    }

    /* renamed from: b */
    public final void mo36429b(Bitmap bitmap) {
        super.mo13621a(bitmap);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: je.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      ahgl.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, int, boolean):void */
    /* renamed from: c */
    public final void mo36433c(int i) {
        super.mo13617a(10000, i, false);
    }

    /* renamed from: d */
    public final void mo36435d(boolean z) {
        super.mo13637c(z);
    }

    /* renamed from: f */
    public final void mo36438f(CharSequence charSequence) {
        super.mo13632b(charSequence);
    }

    /* renamed from: g */
    public final void mo36440g(CharSequence charSequence) {
        super.mo13640e(charSequence);
    }

    /* renamed from: a */
    public final void mo36427a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("android.substName", str);
        super.mo13623a(bundle);
    }

    /* renamed from: b */
    public final void mo36430b(Uri uri) {
        super.mo13622a(uri);
    }

    /* renamed from: b */
    public final void mo36431b(C1106ji jiVar) {
        super.mo13626a(jiVar);
    }

    /* renamed from: b */
    public final void mo36432b(long[] jArr) {
        super.mo13628a(jArr);
    }
}
