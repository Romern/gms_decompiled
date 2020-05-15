package p000;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beas implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public String f106835a = "";

    /* renamed from: b */
    public final List f106836b = new ArrayList();

    /* renamed from: c */
    public final List f106837c = new ArrayList();

    /* renamed from: d */
    private boolean f106838d;

    /* renamed from: e */
    private boolean f106839e;

    /* renamed from: f */
    private String f106840f = "";

    /* renamed from: a */
    public final int mo58500a() {
        return this.f106836b.size();
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f106838d = true;
            this.f106835a = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f106836b.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f106837c.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f106839e = true;
            this.f106840f = readUTF2;
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.f106838d);
        if (this.f106838d) {
            objectOutput.writeUTF(this.f106835a);
        }
        int a = mo58500a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeInt(((Integer) this.f106836b.get(i)).intValue());
        }
        int size = this.f106837c.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            objectOutput.writeInt(((Integer) this.f106837c.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.f106839e);
        if (this.f106839e) {
            objectOutput.writeUTF(this.f106840f);
        }
    }
}
