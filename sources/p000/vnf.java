package p000;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;

/* renamed from: vnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnf extends vlg {

    /* renamed from: a */
    public voc f49573a;

    /* renamed from: b */
    public voa[] f49574b;

    /* renamed from: c */
    private voa f49575c;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        voc a = voc.m40914a(getArguments().getString("sortType"));
        this.f49573a = a;
        this.f49574b = a.f49629h;
        this.f49575c = vob.m40913a(getArguments().getString("currentSortOption"));
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        sdo.m34970a(getActivity() instanceof vne);
        AlertDialog.Builder title = new AlertDialog.Builder(getActivity()).setTitle((int) C0126R.string.drive_menu_sort);
        CharSequence[] charSequenceArr = new CharSequence[this.f49574b.length];
        int i = 0;
        while (true) {
            voa[] voaArr = this.f49574b;
            if (i >= voaArr.length) {
                return title.setSingleChoiceItems(charSequenceArr, Arrays.asList(voaArr).indexOf(this.f49575c), new vnd(this)).create();
            }
            charSequenceArr[i] = getString(voaArr[i].mo28674b());
            i++;
        }
    }
}
