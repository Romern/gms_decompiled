package p000;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beap implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public String f106771a = "";

    /* renamed from: b */
    public String f106772b = "";

    /* renamed from: c */
    public final List f106773c = new ArrayList();

    /* renamed from: d */
    public String f106774d = "";

    /* renamed from: e */
    private boolean f106775e;

    /* renamed from: f */
    private boolean f106776f = false;

    /* renamed from: g */
    private boolean f106777g;

    /* renamed from: h */
    private String f106778h = "";

    /* renamed from: a */
    public final int mo58493a() {
        return this.f106773c.size();
    }

    public final void readExternal(ObjectInput objectInput) {
        this.f106771a = objectInput.readUTF();
        this.f106772b = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f106773c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.f106775e = true;
            this.f106774d = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f106777g = true;
            this.f106778h = readUTF2;
        }
        this.f106776f = objectInput.readBoolean();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f106771a);
        objectOutput.writeUTF(this.f106772b);
        int a = mo58493a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeUTF((String) this.f106773c.get(i));
        }
        objectOutput.writeBoolean(this.f106775e);
        if (this.f106775e) {
            objectOutput.writeUTF(this.f106774d);
        }
        objectOutput.writeBoolean(this.f106777g);
        if (this.f106777g) {
            objectOutput.writeUTF(this.f106778h);
        }
        objectOutput.writeBoolean(this.f106776f);
    }
}
