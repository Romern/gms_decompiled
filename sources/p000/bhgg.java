package p000;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;

/* renamed from: bhgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgg implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ ChipGroup f118594a;

    public bhgg(ChipGroup chipGroup) {
        this.f118594a = chipGroup;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.chip.ChipGroup.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bhjg.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.material.chip.ChipGroup.a(int, boolean):void */
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ChipGroup chipGroup = this.f118594a;
        if (!chipGroup.f151160e) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < chipGroup.getChildCount(); i++) {
                View childAt = chipGroup.getChildAt(i);
                if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                    arrayList.add(Integer.valueOf(childAt.getId()));
                    if (chipGroup.f151156a) {
                        break;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                ChipGroup chipGroup2 = this.f118594a;
                if (chipGroup2.f151157b) {
                    chipGroup2.mo71117a(compoundButton.getId(), true);
                    this.f118594a.f151159d = compoundButton.getId();
                    return;
                }
            }
            int id = compoundButton.getId();
            if (z) {
                ChipGroup chipGroup3 = this.f118594a;
                int i2 = chipGroup3.f151159d;
                if (!(i2 == -1 || i2 == id || !chipGroup3.f151156a)) {
                    chipGroup3.mo71117a(i2, false);
                }
                this.f118594a.f151159d = id;
                return;
            }
            ChipGroup chipGroup4 = this.f118594a;
            if (chipGroup4.f151159d == id) {
                chipGroup4.f151159d = -1;
            }
        }
    }
}
