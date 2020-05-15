package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bkrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkrb {

    /* renamed from: a */
    public static final bkrb f125152a = new bkrb(Collections.emptyList(), Collections.emptyList(), Collections.emptyList());

    /* renamed from: b */
    public final List f125153b;

    /* renamed from: c */
    public final List f125154c;

    /* renamed from: d */
    public final List f125155d;

    public bkrb(List list, List list2, List list3) {
        this.f125153b = Collections.unmodifiableList(new ArrayList(list));
        this.f125154c = Collections.unmodifiableList(new ArrayList(list2));
        this.f125155d = Collections.unmodifiableList(new ArrayList(list3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkrb)) {
            return false;
        }
        bkrb bkrb = (bkrb) obj;
        return bkwv.m106780a(this.f125153b, bkrb.f125153b, this.f125154c, bkrb.f125154c, this.f125155d, bkrb.f125155d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f125153b, this.f125154c, this.f125155d});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f125153b);
        String valueOf2 = String.valueOf(this.f125154c);
        String valueOf3 = String.valueOf(this.f125155d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("UndoManagerState [undoStack=");
        sb.append(valueOf);
        sb.append(", redoStack=");
        sb.append(valueOf2);
        sb.append(", pendingBatchStack=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }
}
