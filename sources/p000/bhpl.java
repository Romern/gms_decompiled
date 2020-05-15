package p000;

import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: bhpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhpl extends C1251oq {

    /* renamed from: b */
    private final TextInputLayout f119266b;

    public bhpl(TextInputLayout textInputLayout) {
        this.f119266b = textInputLayout;
    }

    /* renamed from: a */
    public void mo345a(View view, C1301qm qmVar) {
        Editable editable;
        CharSequence charSequence;
        boolean z;
        String str;
        String str2;
        TextView textView;
        C1301qm qmVar2 = qmVar;
        super.mo345a(view, qmVar);
        EditText editText = this.f119266b.f151297a;
        CharSequence charSequence2 = null;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence a = this.f119266b.mo71248a();
        TextInputLayout textInputLayout = this.f119266b;
        bhox bhox = textInputLayout.f151328b;
        if (bhox.f119240m) {
            charSequence = bhox.f119239l;
        } else {
            charSequence = null;
        }
        CharSequence d = textInputLayout.mo71274d();
        TextInputLayout textInputLayout2 = this.f119266b;
        int i = textInputLayout2.f151330d;
        if (textInputLayout2.f151329c && textInputLayout2.f151331e && (textView = textInputLayout2.f151332f) != null) {
            charSequence2 = textView.getContentDescription();
        }
        boolean z2 = !TextUtils.isEmpty(editable);
        boolean z3 = !TextUtils.isEmpty(a);
        boolean z4 = !TextUtils.isEmpty(charSequence);
        boolean isEmpty = TextUtils.isEmpty(d);
        boolean z5 = !isEmpty;
        if (z5 || !TextUtils.isEmpty(charSequence2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z3) {
            str = "";
        } else {
            str = a.toString();
        }
        String valueOf = String.valueOf(str);
        if ((!z5 && !z4) || TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = ", ";
        }
        String valueOf2 = String.valueOf(str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
        if (z5) {
            charSequence = d;
        } else if (!z4) {
            charSequence = "";
        }
        String valueOf3 = String.valueOf(charSequence);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf2);
        sb.append(valueOf3);
        String sb2 = sb.toString();
        if (z2) {
            qmVar2.mo15760b((CharSequence) editable);
        } else if (!TextUtils.isEmpty(sb2)) {
            qmVar2.mo15760b((CharSequence) sb2);
        }
        if (!TextUtils.isEmpty(sb2)) {
            int i2 = Build.VERSION.SDK_INT;
            qmVar2.mo15770d(sb2);
            int i3 = Build.VERSION.SDK_INT;
            qmVar2.f26877a.setShowingHintText(!z2);
        }
        if (editable == null || editable.length() != i) {
            i = -1;
        }
        int i4 = Build.VERSION.SDK_INT;
        qmVar2.f26877a.setMaxTextLength(i);
        if (z) {
            if (isEmpty) {
                d = charSequence2;
            }
            int i5 = Build.VERSION.SDK_INT;
            qmVar2.f26877a.setError(d);
        }
    }
}
