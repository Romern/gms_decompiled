package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: bkfy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkfy extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ bkfz f124176a;

    public bkfy(bkfz bkfz) {
        this.f124176a = bkfz;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        bkfz bkfz = this.f124176a;
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        int i = bkfz.f124177d;
        int i2 = 0;
        if (collectionInfo != null) {
            i2 = collectionInfo.getColumnCount();
            z = collectionInfo.isHierarchical();
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(bkfz.mo65737a(), i2, z));
    }
}
