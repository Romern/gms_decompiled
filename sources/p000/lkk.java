package p000;

import android.app.AlertDialog;
import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lkk */
final /* synthetic */ class lkk implements aie {

    /* renamed from: a */
    private final Context f26255a;

    public lkk(Context context) {
        this.f26255a = context;
    }

    /* renamed from: a */
    public final Object mo753a(aic aic) {
        Context context = this.f26255a;
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        new AlertDialog.Builder(context).setTitle((int) C0126R.string.autofill_choose_title).setSingleChoiceItems((int) C0126R.array.login_choices, -1, new lko(atomicInteger)).setPositiveButton((int) C0126R.string.common_continue, new lkn(atomicInteger, aic)).setNegativeButton((int) C0126R.string.common_cancel, new lkm(aic)).setOnDismissListener(new lkl(aic)).show().getButton(-1).setEnabled(false);
        return "PromptUserForUsernameOrPassword";
    }
}
