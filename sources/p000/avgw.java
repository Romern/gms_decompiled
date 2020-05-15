package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: avgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgw {

    /* renamed from: a */
    public static final srn f93163a = srn.m36124a();

    /* renamed from: b */
    public final ImageView f93164b;

    /* renamed from: c */
    public final rjx f93165c;

    /* renamed from: d */
    public final rjx f93166d;

    /* renamed from: e */
    private final TextView f93167e;

    /* renamed from: f */
    private final TextView f93168f;

    /* renamed from: g */
    private final avih f93169g;

    public avgw(Context context, View view, int i, int i2, int i3, avih avih, allq allq) {
        rjx a = allr.m61234a(context, allq);
        rjx d = allr.m61237d(context, allq);
        this.f93164b = (ImageView) view.findViewById(i);
        this.f93167e = (TextView) view.findViewById(i2);
        this.f93168f = (TextView) view.findViewById(i3);
        this.f93169g = avih;
        this.f93165c = a;
        this.f93166d = d;
    }

    /* renamed from: a */
    private static alzr m78495a(amey amey, String str) {
        if (amey == null) {
            bnsl bnsl = (bnsl) f93163a.mo68388c();
            bnsl.mo68432a("avgw", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("No owners data arrived with successful response");
            return null;
        }
        Iterator it = amey.iterator();
        while (it.hasNext()) {
            alzr alzr = (alzr) it.next();
            if (alzr.mo41063c().equals(str)) {
                return alzr;
            }
        }
        bnsl bnsl2 = (bnsl) f93163a.mo68388c();
        bnsl2.mo68432a("avgw", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("No Owner found for the current account");
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo51214a(Bitmap bitmap, allh allh) {
        Bitmap bitmap2;
        try {
            Status bo = allh.mo7183bo();
            if (!bo.mo17710c()) {
                bnsl bnsl = (bnsl) f93163a.mo68388c();
                bnsl.mo68432a("avgw", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68413a("Error (%d) loading owner avatar: %s", bo.f30115i, (Object) bo.f30116j);
                bitmap2 = null;
            } else {
                bitmap2 = rzl.m34706a(alls.m61238a(allh.mo40486b()));
            }
            if (bitmap2 != null) {
                bitmap = bitmap2;
            }
            this.f93164b.setImageBitmap(bitmap);
        } finally {
            allh.mo12460c();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avih.a(android.widget.TextView, bxsk, boolean, java.lang.String):void
     arg types: [android.widget.TextView, bxsk, int, ?[OBJECT, ARRAY]]
     candidates:
      avih.a(android.view.View, int, bxsc, com.android.volley.toolbox.ImageLoader):com.android.volley.toolbox.NetworkImageView
      avih.a(android.widget.TextView, java.lang.String, boolean, java.lang.String):boolean
      avih.a(android.widget.TextView, bxsk, boolean, java.lang.String):void */
    /* renamed from: a */
    public final void mo51215a(String str, bxsk bxsk) {
        if (str == null) {
            this.f93169g.mo51265a(this.f93167e, bxsk, false, (String) null);
            this.f93168f.setVisibility(8);
            return;
        }
        this.f93167e.setText(str);
        if (!avih.m78576a(bxsk)) {
            this.f93169g.mo51265a(this.f93168f, bxsk, false, (String) null);
            this.f93168f.setVisibility(0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo51216a(String str, bxsk bxsk, alky alky) {
        alzr alzr;
        try {
            Status bo = alky.mo7183bo();
            String str2 = null;
            if (!bo.mo17710c()) {
                bnsl bnsl = (bnsl) f93163a.mo68388c();
                bnsl.mo68432a("avgw", "a", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68413a("Error (%d) loading owner data: %s", bo.f30115i, (Object) bo.f30116j);
            } else {
                amey b = alky.mo12459b();
                if (b != null) {
                    Iterator it = b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            alzr = (alzr) it.next();
                            if (alzr.mo41063c().equals(str)) {
                                break;
                            }
                        } else {
                            bnsl bnsl2 = (bnsl) f93163a.mo68388c();
                            bnsl2.mo68432a("avgw", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("No Owner found for the current account");
                            alzr = null;
                            break;
                        }
                    }
                } else {
                    bnsl bnsl3 = (bnsl) f93163a.mo68388c();
                    bnsl3.mo68432a("avgw", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("No owners data arrived with successful response");
                    alzr = null;
                }
                if (alzr != null && alzr.mo41065f()) {
                    str2 = alzr.mo41064d();
                }
            }
            mo51215a(str2, bxsk);
        } finally {
            alky.mo12460c();
        }
    }
}
