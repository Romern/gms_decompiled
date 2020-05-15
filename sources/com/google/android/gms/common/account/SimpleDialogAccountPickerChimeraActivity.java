package com.google.android.gms.common.account;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SimpleDialogAccountPickerChimeraActivity extends adcc {

    /* renamed from: b */
    public static final sek f30097b = new sek("CommonAccount", "SimpleAccountPicker");

    /* renamed from: c */
    public String f30098c;

    /* renamed from: d */
    public String f30099d;

    /* renamed from: e */
    public ria f30100e;

    /* renamed from: f */
    public aczl f30101f;

    /* renamed from: g */
    public ListView f30102g;

    /* renamed from: h */
    public int f30103h = -1;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f30101f.mo33274a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ria ria = new ria(getIntent(), 3);
        this.f30100e = ria;
        setTheme(ria.f43022i);
        setTitle((CharSequence) null);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f30103h = bundle.getInt("key-selected-item", -1);
        }
        this.f30099d = this.f30100e.f43020g;
        this.f30098c = rib.m33627b(getApplication(), this.f30099d);
        aczj aczj = new aczj(getApplicationContext(), this.f30099d);
        ria ria2 = this.f30100e;
        aczj.f61144f = ria2.f43017d;
        aczj.mo33270a(ria2.f43014a);
        ria ria3 = this.f30100e;
        aczj.f61141c = ria3.f43015b;
        aczj.f61143e = ria3.f43026m;
        aczj.f61142d = ria3.f43025l;
        aczl aczl = (aczl) adcj.m50162a(this, aczj).mo3444a(aczl.class);
        this.f30101f = aczl;
        aczl.f61157i.mo2445a(this, new rhh(this));
        this.f30101f.f61158j.mo2445a(this, new rhi(this));
        this.f30101f.f61156h.mo2445a(this, new rhj(this));
        this.f30101f.mo33273a();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f30101f.mo33276b();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key-selected-item", this.f30103h);
    }
}
