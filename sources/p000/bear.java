package p000;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bear */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bear implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final List f106834a = new ArrayList();

    public final void readExternal(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            beaq beaq = new beaq();
            beaq.readExternal(objectInput);
            this.f106834a.add(beaq);
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        int size = this.f106834a.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((beaq) this.f106834a.get(i)).writeExternal(objectOutput);
        }
    }
}
