package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: deu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class deu extends dnx implements C1352sj, C1128kd {

    /* renamed from: CY */
    private C1353sk f12986CY;

    /* renamed from: a */
    public void mo8626a(Toolbar toolbar) {
        mo8632bu().mo15935a(toolbar);
    }

    /* renamed from: aW */
    public final C1341rz mo8628aW() {
        return mo8632bu().mo15933a();
    }

    /* renamed from: aX */
    public boolean mo8629aX() {
        Intent aY = mo8630aY();
        if (aY == null) {
            return false;
        }
        if (mo8627a(aY)) {
            C1129ke a = C1129ke.m17707a(this);
            a.mo14420a(getContainerActivity());
            a.mo14419a();
            try {
                C1133kh.m17839a(getContainerActivity());
                return true;
            } catch (IllegalStateException e) {
                finish();
                return true;
            }
        } else {
            C1094ix.m16256b(getContainerActivity(), aY);
            return true;
        }
    }

    /* renamed from: aY */
    public final Intent mo8630aY() {
        return C1094ix.m16254b(getContainerActivity());
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo8632bu().mo15941b(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mo8632bu();
    }

    /* renamed from: bu */
    public final C1353sk mo8632bu() {
        if (this.f12986CY == null) {
            this.f12986CY = C1353sk.m20235a(this, getContainerActivity(), this);
        }
        return this.f12986CY;
    }

    /* renamed from: bv */
    public final C1414ur mo8633bv() {
        return null;
    }

    public final void closeOptionsMenu() {
        C1341rz aW = mo8628aW();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (aW == null || !aW.mo15871j()) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C1341rz aW = mo8628aW();
        if (keyCode == 82 && aW != null && aW.mo15848a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int i) {
        return mo8632bu().mo15940b(i);
    }

    public final MenuInflater getMenuInflater() {
        return mo8632bu().mo15939b();
    }

    public final Resources getResources() {
        aed.m595a();
        return super.getResources();
    }

    public final void invalidateOptionsMenu() {
        mo8632bu().mo15947f();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo8632bu().mo15955p();
    }

    public final void onContentChanged() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C1353sk bu = mo8632bu();
        bu.mo15949h();
        bu.mo15952k();
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo8632bu().mo15948g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C1341rz aW = mo8628aW();
        if (menuItem.getItemId() != 16908332 || aW == null || (aW.mo15854c() & 4) == 0) {
            return false;
        }
        return mo8629aX();
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo8632bu().mo15953l();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo8632bu().mo15946e();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo8632bu().mo15954m();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo8632bu().mo15942c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo8632bu().mo15944d();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo8632bu().mo15938a(charSequence);
    }

    public final void openOptionsMenu() {
        C1341rz aW = mo8628aW();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (aW == null || !aW.mo15870i()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i) {
        mo8632bu().mo15943c(i);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        mo8632bu().mo15934a(i);
    }

    public final void supportInvalidateOptionsMenu() {
        mo8632bu().mo15947f();
    }

    /* renamed from: a */
    public boolean mo8627a(Intent intent) {
        return C1094ix.m16253a(getContainerActivity(), intent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = Build.VERSION.SDK_INT;
        return super.onKeyDown(i, keyEvent);
    }

    public final void setContentView(View view) {
        mo8632bu().mo15936a(view);
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo8632bu().mo15937a(view, layoutParams);
    }
}
