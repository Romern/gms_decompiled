package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;

/* renamed from: svk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svk extends svc implements sui {

    /* renamed from: a */
    private CharSequence f45231a;

    /* renamed from: b */
    private svf f45232b;

    /* renamed from: g */
    public final Context f45233g;

    /* renamed from: h */
    public Drawable f45234h;

    /* renamed from: i */
    public Intent f45235i;

    /* renamed from: j */
    public suh f45236j;

    /* renamed from: k */
    public boolean f45237k = true;

    public svk(Context context) {
        this.f45233g = context;
    }

    /* renamed from: a */
    public int mo23821a() {
        return C0126R.C0128layout.common_settings_item;
    }

    /* renamed from: a */
    public void mo26103a(svf svf) {
        this.f45232b = svf;
    }

    /* renamed from: b */
    public svb mo23822b() {
        return suz.m36396a();
    }

    /* renamed from: c */
    public final void mo26106c(int i) {
        mo26085a(this.f45233g.getText(i));
    }

    /* renamed from: d */
    public final void mo26107d(int i) {
        mo26105b(this.f45233g.getText(i));
    }

    public boolean equals(Object obj) {
        return (obj instanceof svk) && hashCode() == obj.hashCode();
    }

    /* renamed from: g */
    public CharSequence mo26161g() {
        return this.f45231a;
    }

    /* renamed from: h */
    public boolean mo26162h() {
        return this.f45237k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45231a, this.f45234h, Integer.valueOf(mo26087c()), mo26088d()});
    }

    /* renamed from: i */
    public final void mo26164i() {
        int indexOf;
        svf svf = this.f45232b;
        if (svf != null && (indexOf = svf.f45214a.indexOf(this)) >= 0) {
            suf suf = svf.f45215b;
            if (suf != null) {
                suf.mo26093d(indexOf);
            }
            boolean z = false;
            if (indexOf > 0 && sud.m36341a((sue) svf.f45214a.get(indexOf - 1), this) > 0) {
                z = true;
            }
            if ((indexOf < svf.f45214a.size() - 1 && sud.m36341a((sue) svf.f45214a.get(indexOf + 1), this) < 0) || z) {
                svf.f45214a.remove(indexOf);
                int c = svf.mo26152c(this);
                suf suf2 = svf.f45215b;
                if (suf2 != null) {
                    suf2.mo26090a(indexOf, c);
                }
            }
        }
    }

    public void onClick(View view) {
        suh suh = this.f45236j;
        if (suh != null) {
            suh.mo7099a(view, this);
        }
        if (this.f45235i != null) {
            try {
                view.getContext().startActivity(this.f45235i);
            } catch (ActivityNotFoundException e) {
                Log.d("DefaultSimpleSettingItem", "Failed to start activity", e);
            }
        }
    }

    /* renamed from: a */
    public void mo26084a(int i) {
        this.f45210e = i;
        mo26164i();
    }

    /* renamed from: b */
    public void mo26086b(int i) {
        this.f45209d = i;
        mo26164i();
    }

    /* renamed from: a */
    public final void mo26100a(Intent intent) {
        this.f45235i = intent;
        mo26164i();
    }

    /* renamed from: b */
    public void mo26105b(CharSequence charSequence) {
        this.f45231a = charSequence;
        mo26164i();
    }

    /* renamed from: a */
    public final void mo26101a(Drawable drawable) {
        this.f45234h = drawable;
        mo26164i();
    }

    /* renamed from: a */
    public void mo26085a(CharSequence charSequence) {
        this.f45211f = charSequence;
        mo26164i();
    }

    /* renamed from: a */
    public final void mo26102a(suh suh) {
        this.f45236j = suh;
        mo26164i();
    }

    /* renamed from: a */
    public void mo26104a(boolean z) {
        this.f45237k = z;
        mo26164i();
    }
}
