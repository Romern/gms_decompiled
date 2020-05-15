package com.google.autofill.detection.p098ml;

import java.util.Collection;
import java.util.List;

/* renamed from: com.google.autofill.detection.ml.AndBooleanSignal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class AndBooleanSignal extends BooleanSignal {
    private static final int CURRENT_VERSION_CODE = 1;
    public static final bllu READER = new bllu() {
        /* class com.google.autofill.detection.p098ml.AndBooleanSignal.C16841 */

        private AndBooleanSignal readFromBundleV1(bllt bllt) {
            int c = bllt.mo66673c();
            bngs j = bngx.m109377j();
            for (int i = 0; i < c; i++) {
                j.mo67668c((BooleanSignal) bllt.mo66677g());
            }
            return new AndBooleanSignal(j.mo67664a());
        }

        public AndBooleanSignal readFromBundle(bllt bllt) {
            int c = bllt.mo66673c();
            if (c == 1) {
                return readFromBundleV1(bllt);
            }
            StringBuilder sb = new StringBuilder(45);
            sb.append("Unable to read bundle of version: ");
            sb.append(c);
            throw new bllj(sb.toString());
        }
    };
    final bngx signals;

    public AndBooleanSignal(List list) {
        this.signals = bngx.m109368a((Collection) list);
    }

    /* access modifiers changed from: protected */
    public boolean generateBoolean(kom kom) {
        if (this.signals.isEmpty()) {
            return false;
        }
        bnre i = this.signals.listIterator();
        while (i.hasNext()) {
            if (!((BooleanSignal) i.next()).generateBoolean(kom)) {
                return false;
            }
        }
        return true;
    }

    public void reset() {
        bnre i = this.signals.listIterator();
        while (i.hasNext()) {
            ((Signal) i.next()).reset();
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.signals);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 5);
        sb.append("and(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public void writeToBundle(bllt bllt) {
        bllt.mo66667a(1);
        bllt.mo66667a(this.signals.size());
        bnre i = this.signals.listIterator();
        while (i.hasNext()) {
            bllt.mo66668a((Signal) i.next());
        }
    }
}
