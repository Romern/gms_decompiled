package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;

/* renamed from: lvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvj extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ SetBackupAccountChimeraActivity f33039a;

    /* renamed from: b */
    private final LayoutInflater f33040b;

    /* renamed from: c */
    private final String[] f33041c;

    /* renamed from: d */
    private final Drawable f33042d;

    /* renamed from: e */
    private final Drawable f33043e;

    /* renamed from: f */
    private final int f33044f;

    /* renamed from: g */
    private float f33045g = -1.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lvj(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity, Context context, String[] strArr, Drawable drawable, Drawable drawable2) {
        super(context, 17367043, strArr);
        this.f33039a = setBackupAccountChimeraActivity;
        this.f33041c = strArr;
        this.f33044f = strArr.length;
        this.f33042d = drawable;
        this.f33043e = drawable2;
        this.f33040b = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        lvk lvk;
        if (view == null) {
            view = this.f33040b.inflate((int) C0126R.C0128layout.account_row, (ViewGroup) null);
            lvk = new lvk();
            lvk.f33047b = (TextView) view.findViewById(C0126R.C0129id.text);
            lvk.f33046a = (ImageView) view.findViewById(C0126R.C0129id.icon);
            if (ccop.m131034d()) {
                ((CardView) view.findViewById(C0126R.C0129id.card)).mo1866b();
            }
            view.setTag(lvk);
        } else {
            lvk = (lvk) view.getTag();
        }
        lvk.f33047b.setText(this.f33041c[i]);
        if (i == this.f33044f - 1) {
            lvk.f33046a.setImageDrawable(this.f33043e);
        } else {
            if (i == 0 && this.f33045g < 0.0f) {
                float dimension = getContext().getResources().getDimension(C0126R.dimen.abc_text_size_menu_material);
                TextView textView = lvk.f33047b;
                int i2 = Build.VERSION.SDK_INT;
                textView.setAutoSizeTextTypeUniformWithConfiguration(1, (int) dimension, 1, 0);
            }
            SetBackupAccountChimeraActivity setBackupAccountChimeraActivity = this.f33039a;
            lvn lvn = SetBackupAccountChimeraActivity.f29004a;
            if (!setBackupAccountChimeraActivity.f29006c.containsKey(this.f33041c[i])) {
                lvk.f33046a.setImageDrawable(this.f33042d);
            } else {
                byte[] bArr = (byte[]) this.f33039a.f29006c.get(this.f33041c[i]);
                lvk.f33046a.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                lvk.f33046a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        }
        if (this.f33045g < 0.0f && viewGroup.getChildCount() > 0) {
            this.f33045g = ((TextView) viewGroup.getChildAt(0).findViewById(C0126R.C0129id.text)).getTextSize();
        }
        if (this.f33045g > 0.0f) {
            C1334rs.m20106b(lvk.f33047b, 0);
            lvk.f33047b.setTextSize(0, this.f33045g);
        }
        return view;
    }
}
