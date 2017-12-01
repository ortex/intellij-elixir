package org.elixir_lang.psi.stub.index;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import org.elixir_lang.psi.NamedElement;
import org.jetbrains.annotations.NotNull;

public class AllName extends StringStubIndexExtension<NamedElement> {
    public static final StubIndexKey<String, NamedElement> KEY = StubIndexKey.createIndexKey("elixir.all.name");
    // 4 - adds defp and defmacrop to decompiled beam files
    public static final int VERSION = 4;

    @Override
    public int getVersion() {
        return super.getVersion() + VERSION;
    }

    @NotNull
    @Override
    public StubIndexKey<String, NamedElement> getKey() {
        return KEY;
    }
}
