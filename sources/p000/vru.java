package p000;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vru extends vsh {

    /* renamed from: a */
    final /* synthetic */ vrv f49878a;

    public vru(vrv vrv) {
        this.f49878a = vrv;
    }

    /* renamed from: a */
    public final void mo28762a() {
        vrs vrs;
        vrv vrv = this.f49878a;
        vrv.f49881c.removeAllViews();
        LayoutInflater from = LayoutInflater.from(vrv.getContext());
        String a = vrv.f49879a.mo28775a().mo28740a();
        vsi vsi = vrv.f49879a;
        List<ResolveInfo> queryIntentActivities = vsi.f49899a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT"), 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (resolveInfo.activityInfo != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (TextUtils.equals("com.google.android.projection.gearhead", str)) {
                vrs = new vqj();
            } else {
                vrs = new vrc(str);
            }
            if (vrs.mo28744c(vsi.f49899a)) {
                arrayList2.add(vrs);
            }
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            vrs vrs2 = (vrs) arrayList2.get(i2);
            String a2 = vrs2.mo28740a();
            if (vrs2.mo28743c() != 2) {
                vrv.mo28771a(from, vrs2.mo28739a(vrv.getContext()), null, TextUtils.equals(a, a2), a2);
            }
        }
        boolean d = new vqj().mo28745d(vrv.getContext());
        int i3 = !d ? C0126R.string.f7396x534b01fb : C0126R.string.car_driving_mode_behavior_android_auto_pref_option_summary;
        if (ccrg.m131344d() || d) {
            vrv.mo28771a(from, vrv.getString(C0126R.string.car_driving_mode_behavior_android_auto_pref_option_title), vrv.getString(i3), TextUtils.equals(a, "com.google.android.projection.gearhead"), "com.google.android.projection.gearhead");
        }
        if (ccrg.m131342b()) {
            vrv.mo28771a(from, vrv.getString(C0126R.string.car_driving_mode_behavior_morris_pref_option_title), vrv.getString(C0126R.string.car_driving_mode_behavior_morris_pref_option_summary), TextUtils.equals(a, "car_pref_key_driving_mode_behavior_morris_preference"), "car_pref_key_driving_mode_behavior_morris_preference");
        }
        if (ceyg.f183508a.mo6606a().showDndBehavior()) {
            vrv.mo28771a(from, vrv.getString(C0126R.string.car_driving_mode_behavior_dnd_pref_option_title), null, TextUtils.equals(a, "car_pref_key_driving_mode_behavior_dnd_preference"), "car_pref_key_driving_mode_behavior_dnd_preference");
        }
        if (ccrg.m131343c() || (!d && !vrv.f49880b.mo28756a() && !ccrg.m131342b())) {
            vrv.mo28771a(from, vrv.getString(C0126R.string.car_driving_mode_behavior_empty_pref_option_title), null, TextUtils.equals(a, "car_pref_key_driving_mode_behavior_none_preference"), "car_pref_key_driving_mode_behavior_none_preference");
        }
    }
}
