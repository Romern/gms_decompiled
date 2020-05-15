package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class atex extends deu implements LayoutInflater.Factory2, ateu {

    /* renamed from: b */
    private atew f90213b;

    /* renamed from: d */
    public final AccountInfo mo49909d() {
        return mo49917k().f90210a;
    }

    public final Object getSystemService(String str) {
        if (str.equals("layout_inflater")) {
            return mo49917k().mo49912a();
        }
        return super.getSystemService(str);
    }

    /* renamed from: k */
    public final atew mo49917k() {
        if (this.f90213b == null) {
            this.f90213b = new atew(this, (LayoutInflater) super.getSystemService("layout_inflater"));
        }
        return this.f90213b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        atew k = mo49917k();
        this.f90213b = k;
        k.mo49914b();
        mo8632bu();
        super.onCreate(bundle);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View view2;
        if (mo8632bu() instanceof LayoutInflater.Factory2) {
            view2 = ((LayoutInflater.Factory2) mo8632bu()).onCreateView(view, str, context, attributeSet);
        } else {
            view2 = null;
        }
        return view2 == null ? super.onCreateView(view, str, context, attributeSet) : view2;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        new atam(this, mo49917k().f90210a).mo49748a(getContainerActivity().getClass().getCanonicalName());
    }

    public void startActivityForResult(Intent intent, int i) {
        mo49917k().mo49913a(intent);
        super.startActivityForResult(intent, i);
    }
}
