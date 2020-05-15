package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: aaso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaso {
    /* renamed from: a */
    public static Drawable m46932a(Context context, Drawable drawable, int i) {
        Drawable a = aayh.m47231a(drawable, context.getResources());
        aayh.m47245a(a, context, i);
        return a;
    }

    /* renamed from: a */
    public static void m46933a(aasm aasm, HelpChimeraActivity helpChimeraActivity) {
        abht.m47727a(helpChimeraActivity, Uri.parse(aasm.f56501k), helpChimeraActivity.f56986y, helpChimeraActivity.f56987z);
    }

    /* renamed from: a */
    public static void m46934a(aass aass, aasm aasm, int i, int i2, String str) {
        aass.mo31750a(Uri.parse(aasm.f56499i), i, aasm.f56497g, i2, str);
    }

    /* renamed from: a */
    public static void m46935a(aazy aazy, aasm aasm, HelpChimeraActivity helpChimeraActivity) {
        aazy.f56911a = aasm.f56496f;
        if (aasm.mo31736s()) {
            aazy.f56912b = aasm.mo31735r();
        }
        aazy.f56913c = aasm.f56497g;
        aazy.f56914d = aasm.mo31740v();
        aazy.f56917g = helpChimeraActivity.f56986y;
        aazy.show(helpChimeraActivity.getSupportFragmentManager(), "setting_action_dialog");
    }

    /* renamed from: a */
    public static boolean m46936a(ImageView imageView, aasm aasm, Context context) {
        Drawable drawable;
        if (aasm.mo31720e()) {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_drive_document_googblue_24);
            return true;
        } else if (aasm.mo31722f()) {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_drive_document_googblue_24);
            return true;
        } else if (aasm.mo31727j() || aasm.mo31728k() || aasm.mo31734q()) {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_forum_googblue_24);
            return true;
        } else if (aasm.mo31729l()) {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_android_googblue_24);
            return true;
        } else if (aasm.mo31724h()) {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_drive_document_googblue_24);
            return true;
        } else if (aasm.mo31730m()) {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_exit_to_app_googblue_24);
            return true;
        } else if (aasm.mo31731n()) {
            Drawable a = C1133kh.m17836a(context, (int) C0126R.C0127drawable.quantum_ic_settings_white_24);
            if (aayi.m47270b()) {
                drawable = aayh.m47257b(a, context, C1133kh.m17843b(context, C0126R.color.material_google_blue_500));
            } else {
                drawable = m46932a(context, a, (int) C0126R.color.material_google_blue_500);
            }
            imageView.setImageDrawable(drawable);
            return true;
        } else if (!aasm.mo31732o()) {
            return aasm.mo31723g();
        } else {
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_exit_to_app_googblue_24);
            return true;
        }
    }
}
