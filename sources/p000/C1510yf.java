package p000;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.AppCompatSpinner;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: yf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1510yf implements DialogInterface.OnClickListener, C1517ym {

    /* renamed from: a */
    C1350sh f27640a;

    /* renamed from: b */
    final /* synthetic */ AppCompatSpinner f27641b;

    /* renamed from: c */
    private ListAdapter f27642c;

    /* renamed from: d */
    private CharSequence f27643d;

    public C1510yf(AppCompatSpinner appCompatSpinner) {
        this.f27641b = appCompatSpinner;
    }

    /* renamed from: a */
    public final CharSequence mo16535a() {
        return this.f27643d;
    }

    /* renamed from: a */
    public final void mo16539a(ListAdapter listAdapter) {
        this.f27642c = listAdapter;
    }

    /* renamed from: a */
    public final void mo16540a(CharSequence charSequence) {
        this.f27643d = charSequence;
    }

    /* renamed from: b */
    public final Drawable mo16541b() {
        return null;
    }

    /* renamed from: c */
    public final int mo16543c() {
        return 0;
    }

    /* renamed from: d */
    public final void mo16545d() {
        C1350sh shVar = this.f27640a;
        if (shVar != null) {
            shVar.dismiss();
            this.f27640a = null;
        }
    }

    /* renamed from: e */
    public final boolean mo16546e() {
        C1350sh shVar = this.f27640a;
        if (shVar != null) {
            return shVar.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public final int mo16547f() {
        return 0;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f27641b.setSelection(i);
        if (this.f27641b.getOnItemClickListener() != null) {
            this.f27641b.performItemClick(null, i, this.f27642c.getItemId(i));
        }
        mo16545d();
    }

    /* renamed from: a */
    public final void mo16536a(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    /* renamed from: b */
    public final void mo16542b(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    /* renamed from: c */
    public final void mo16544c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    /* renamed from: a */
    public final void mo16537a(int i, int i2) {
        if (this.f27642c != null) {
            C1349sg sgVar = new C1349sg(this.f27641b.f1188a);
            CharSequence charSequence = this.f27643d;
            if (charSequence != null) {
                sgVar.mo15908b(charSequence);
            }
            sgVar.mo15898a(this.f27642c, this.f27641b.getSelectedItemPosition(), this);
            C1350sh b = sgVar.mo15904b();
            this.f27640a = b;
            ListView a = b.mo15914a();
            int i3 = Build.VERSION.SDK_INT;
            a.setTextDirection(i);
            a.setTextAlignment(i2);
            this.f27640a.show();
        }
    }

    /* renamed from: a */
    public final void mo16538a(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }
}
