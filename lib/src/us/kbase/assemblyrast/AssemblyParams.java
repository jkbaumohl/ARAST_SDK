
package us.kbase.assemblyrast;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: AssemblyParams</p>
 * <pre>
 * Run individual assemblers supported by AssemblyRAST.
 * workspace_name - the name of the workspace for input/output
 * read_library_name - the name of the PE read library (SE library support in the future)
 * output_contig_set_name - the name of the output contigset
 * extra_params - assembler specific parameters
 * min_contig_length - minimum length of contigs to output, default 200
 * @optional min_contig_len
 * @optional extra_params
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "read_library_names",
    "read_library_refs",
    "output_contigset_name",
    "min_contig_len",
    "extra_params"
})
public class AssemblyParams {

    @JsonProperty("workspace_name")
    private java.lang.String workspaceName;
    @JsonProperty("read_library_names")
    private List<String> readLibraryNames;
    @JsonProperty("read_library_refs")
    private List<String> readLibraryRefs;
    @JsonProperty("output_contigset_name")
    private java.lang.String outputContigsetName;
    @JsonProperty("min_contig_len")
    private Long minContigLen;
    @JsonProperty("extra_params")
    private List<String> extraParams;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("workspace_name")
    public java.lang.String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public AssemblyParams withWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("read_library_names")
    public List<String> getReadLibraryNames() {
        return readLibraryNames;
    }

    @JsonProperty("read_library_names")
    public void setReadLibraryNames(List<String> readLibraryNames) {
        this.readLibraryNames = readLibraryNames;
    }

    public AssemblyParams withReadLibraryNames(List<String> readLibraryNames) {
        this.readLibraryNames = readLibraryNames;
        return this;
    }

    @JsonProperty("read_library_refs")
    public List<String> getReadLibraryRefs() {
        return readLibraryRefs;
    }

    @JsonProperty("read_library_refs")
    public void setReadLibraryRefs(List<String> readLibraryRefs) {
        this.readLibraryRefs = readLibraryRefs;
    }

    public AssemblyParams withReadLibraryRefs(List<String> readLibraryRefs) {
        this.readLibraryRefs = readLibraryRefs;
        return this;
    }

    @JsonProperty("output_contigset_name")
    public java.lang.String getOutputContigsetName() {
        return outputContigsetName;
    }

    @JsonProperty("output_contigset_name")
    public void setOutputContigsetName(java.lang.String outputContigsetName) {
        this.outputContigsetName = outputContigsetName;
    }

    public AssemblyParams withOutputContigsetName(java.lang.String outputContigsetName) {
        this.outputContigsetName = outputContigsetName;
        return this;
    }

    @JsonProperty("min_contig_len")
    public Long getMinContigLen() {
        return minContigLen;
    }

    @JsonProperty("min_contig_len")
    public void setMinContigLen(Long minContigLen) {
        this.minContigLen = minContigLen;
    }

    public AssemblyParams withMinContigLen(Long minContigLen) {
        this.minContigLen = minContigLen;
        return this;
    }

    @JsonProperty("extra_params")
    public List<String> getExtraParams() {
        return extraParams;
    }

    @JsonProperty("extra_params")
    public void setExtraParams(List<String> extraParams) {
        this.extraParams = extraParams;
    }

    public AssemblyParams withExtraParams(List<String> extraParams) {
        this.extraParams = extraParams;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((("AssemblyParams"+" [workspaceName=")+ workspaceName)+", readLibraryNames=")+ readLibraryNames)+", readLibraryRefs=")+ readLibraryRefs)+", outputContigsetName=")+ outputContigsetName)+", minContigLen=")+ minContigLen)+", extraParams=")+ extraParams)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
