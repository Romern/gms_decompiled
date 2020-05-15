package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: si */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1351si extends C1021gj implements C1352sj, C1128kd {

    /* renamed from: k */
    private C1353sk f27025k;

    /* renamed from: aY */
    public final Intent mo8630aY() {
        return C1094ix.m16254b(this);
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo15921e().mo15941b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(mo15921e().mo15932a(context));
    }

    /* renamed from: b */
    public final void mo8650b() {
        mo15921e().mo15947f();
    }

    /* renamed from: bv */
    public final C1414ur mo8633bv() {
        return null;
    }

    public final void closeOptionsMenu() {
        C1341rz d = mo8657d();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (d == null || !d.mo15871j()) {
            super.closeOptionsMenu();
        }
    }

    /* renamed from: d */
    public final C1341rz mo8657d() {
        return mo15921e().mo15933a();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C1341rz d = mo8657d();
        if (keyCode == 82 && d != null && d.mo15848a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public final C1353sk mo15921e() {
        if (this.f27025k == null) {
            this.f27025k = C1353sk.m20233a(this, this);
        }
        return this.f27025k;
    }

    public final View findViewById(int i) {
        return mo15921e().mo15940b(i);
    }

    public final MenuInflater getMenuInflater() {
        return mo15921e().mo15939b();
    }

    public final Resources getResources() {
        aed.m595a();
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        mo15921e().mo15947f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo15921e().mo15955p();
    }

    public final void onContentChanged() {
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C1353sk e = mo15921e();
        e.mo15949h();
        e.mo15952k();
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        mo15921e().mo15948g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent b;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C1341rz d = mo8657d();
        if (menuItem.getItemId() != 16908332 || d == null || (d.mo15854c() & 4) == 0 || (b = C1094ix.m16254b(this)) == null) {
            return false;
        }
        if (!C1094ix.m16253a(this, b)) {
            C1094ix.m16256b(this, b);
            return true;
        }
        C1129ke a = C1129ke.m17707a((Context) this);
        a.mo14420a((Activity) this);
        a.mo14419a();
        try {
            C1133kh.m17839a((Activity) this);
            return true;
        } catch (IllegalStateException e) {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo15921e().mo15953l();
    }

    /* access modifiers changed from: protected */
    public final void onPostResume() {
        super.onPostResume();
        mo15921e().mo15946e();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo15921e().mo15954m();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        mo15921e().mo15942c();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        mo15921e().mo15944d();
    }

    /* access modifiers changed from: protected */
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo15921e().mo15938a(charSequence);
    }

    public final void openOptionsMenu() {
        C1341rz d = mo8657d();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (d == null || !d.mo15870i()) {
            super.openOptionsMenu();
        }
    }

    public final void setContentView(int i) {
        mo15921e().mo15943c(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        mo15921e().mo15934a(i);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = Build.VERSION.SDK_INT;
        return super.onKeyDown(i, keyEvent);
    }

    public final void setContentView(View view) {
        mo15921e().mo15936a(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo15921e().mo15937a(view, layoutParams);
    }
}
