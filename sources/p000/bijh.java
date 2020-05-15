package p000;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bijh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aelh[] f120718a;

    /* renamed from: b */
    final /* synthetic */ AliasEditorChimeraActivity f120719b;

    public bijh(AliasEditorChimeraActivity aliasEditorChimeraActivity, aelh[] aelhArr) {
        this.f120719b = aliasEditorChimeraActivity;
        this.f120718a = aelhArr;
    }

    public final void run() {
        this.f120719b.mo71309k();
        AliasEditorChimeraActivity aliasEditorChimeraActivity = this.f120719b;
        aliasEditorChimeraActivity.f151380h = this.f120718a[0];
        if (aliasEditorChimeraActivity.f151381i != null) {
            int i = !aliasEditorChimeraActivity.f151377e.f120752b.equalsIgnoreCase("Home") ? !this.f120719b.f151377e.f120752b.equalsIgnoreCase("Work") ? C0126R.string.alias_editor_alias_display : C0126R.string.alias_editor_work_display : C0126R.string.alias_editor_home_display;
            AccessibilityEvent obtain = AccessibilityEvent.obtain((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
            AliasEditorChimeraActivity aliasEditorChimeraActivity2 = this.f120719b;
            obtain.setContentDescription(aliasEditorChimeraActivity2.getString(C0126R.string.alias_editor_address_updated_accessibility_content, new Object[]{aliasEditorChimeraActivity2.getString(i), this.f120719b.f151380h.mo8025r()}));
            try {
                ((AccessibilityManager) this.f120719b.getSystemService("accessibility")).sendAccessibilityEvent(obtain);
            } catch (IllegalStateException e) {
            }
            this.f120719b.f151381i = null;
            this.f120719b.mo71310l();
        }
    }
}
