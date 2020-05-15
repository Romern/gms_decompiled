package p000;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import com.google.android.wallet.bender3.impl.p096ui.common.input.TransformEditText;
import java.util.ArrayList;

/* renamed from: bjoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjoz implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TransformEditText f123069a;

    public bjoz(TransformEditText transformEditText) {
        this.f123069a = transformEditText;
    }

    public final void afterTextChanged(Editable editable) {
        TransformEditText transformEditText = this.f123069a;
        if (!transformEditText.f151776d) {
            if (transformEditText.f151777e) {
                transformEditText.mo71773c();
                this.f123069a.f151777e = false;
            }
            TransformEditText transformEditText2 = this.f123069a;
            bjpc bjpc = transformEditText2.f151775c;
            bjpc.f123070a = transformEditText2.f151780h;
            bjpc.f123071b = transformEditText2.f151778f;
            transformEditText2.mo71768a(bjpc);
            TransformEditText transformEditText3 = this.f123069a;
            bjpc bjpc2 = transformEditText3.f151775c;
            CharSequence charSequence = bjpc2.f123070a;
            int i = bjpc2.f123071b;
            transformEditText3.f151776d = true;
            InputFilter[] filters = editable.getFilters();
            ArrayList arrayList = new ArrayList();
            for (InputFilter inputFilter : filters) {
                if (!(inputFilter instanceof DigitsKeyListener)) {
                    arrayList.add(inputFilter);
                }
            }
            editable.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
            editable.replace(0, editable.length(), charSequence, 0, charSequence.length());
            Selection.setSelection(editable, i);
            transformEditText3.f151776d = false;
            this.f123069a.mo71771b();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TransformEditText transformEditText = this.f123069a;
        if (!transformEditText.f151776d) {
            transformEditText.f151778f = 0;
            if (transformEditText.f151780h == null) {
                transformEditText.f151780h = new StringBuilder();
            }
            TransformEditText transformEditText2 = this.f123069a;
            transformEditText2.f151775c.f123070a = transformEditText2.mo71767a();
            if (this.f123069a.getSelectionStart() == this.f123069a.getSelectionEnd() && i2 == 1 && i3 == 0) {
                TransformEditText transformEditText3 = this.f123069a;
                bjpc bjpc = transformEditText3.f151775c;
                bjpc.f123071b = i + 1;
                transformEditText3.mo71772b(bjpc);
                TransformEditText transformEditText4 = this.f123069a;
                int i4 = transformEditText4.f151775c.f123071b;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    transformEditText4.f151778f = i5;
                    transformEditText4.f151780h.delete(i5, i4);
                    this.f123069a.f151777e = true;
                    return;
                }
                return;
            }
            TransformEditText transformEditText5 = this.f123069a;
            bjpc bjpc2 = transformEditText5.f151775c;
            bjpc2.f123071b = i;
            transformEditText5.mo71772b(bjpc2);
            TransformEditText transformEditText6 = this.f123069a;
            bjpc bjpc3 = transformEditText6.f151775c;
            transformEditText6.f151778f = bjpc3.f123071b;
            if (i2 > 0) {
                bjpc3.f123070a = transformEditText6.mo71767a();
                TransformEditText transformEditText7 = this.f123069a;
                bjpc bjpc4 = transformEditText7.f151775c;
                bjpc4.f123071b = i + i2;
                transformEditText7.mo71772b(bjpc4);
                TransformEditText transformEditText8 = this.f123069a;
                transformEditText8.f151780h.delete(transformEditText8.f151778f, transformEditText8.f151775c.f123071b);
                this.f123069a.f151777e = true;
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TransformEditText transformEditText;
        int i4;
        TransformEditText transformEditText2 = this.f123069a;
        if (!transformEditText2.f151776d && i3 > 0) {
            transformEditText2.f151780h.insert(transformEditText2.f151778f, charSequence, i, i + i3);
            TransformEditText transformEditText3 = this.f123069a;
            transformEditText3.f151777e = true;
            if (transformEditText3.f151779g >= 0 && transformEditText3.f151780h.length() > (i4 = (transformEditText = this.f123069a).f151779g)) {
                transformEditText.f151780h.setLength(i4);
            }
            this.f123069a.f151778f += i3;
        }
    }
}
